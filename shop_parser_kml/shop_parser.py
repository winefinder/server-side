#!/usr/bin/python3
from pykml import parser
from os import path
import requests
import time
import json

kml_file = path.join('./shop_list.kml')
insertFile = open('insert_query.txt','w')
errorFile = open('search_fail.txt','w')

header = {"Authorization": "KakaoAK aa33192fc00ac831cc1bca872b1932c7"}
apiUrl = "https://dapi.kakao.com/v2/local/search/address.json"
with open(kml_file) as f:
    doc = parser.parse(f).getroot()
    cnt = 0
    for e in doc.Document.Folder.Placemark:
        shopName = e.name
        shopAddress = e.address
        shopDetailAddress = e.ExtendedData.Data[1].value.text
        shopPhoneNum = e.ExtendedData.Data[2].value.text
        queryString = {"query":shopAddress}
        response = requests.get(apiUrl,headers=header,params=queryString)
        res = json.loads(response.text)
        print(json.dumps(res,indent=4,ensure_ascii=False))
        resultCnt = res["meta"]["total_count"]
        shopLng = "0"
        shopLat = "0"
        if resultCnt > 0:
            shopLng = res["documents"][0]["x"]
            shopLat = res["documents"][0]["y"]
            print("insert into RETAIL_INFO(RTL_NAME,RTL_REG_NO,RTL_PHONE,RTL_LOCATION,RTL_ADDRESS,RTL_USER_ID) values ('%s','%s','%s',ST_GeomFromText( 'POINT(%s %s)' ),'%s','%s');"
                % (shopName,cnt,shopPhoneNum,shopLng,shopLat,shopAddress,"tuser"+str(cnt)))
            insertFile.write("insert into RETAIL_INFO(RTL_NAME,RTL_REG_NO,RTL_PHONE,RTL_LOCATION,RTL_ADDRESS,RTL_USER_ID) values ('%s','%s','%s',ST_GeomFromText( 'POINT(%s %s)' ),'%s','%s');"
               % (shopName,cnt,shopPhoneNum,shopLng,shopLat,shopAddress,"tuser"+str(cnt)))
            insertFile.write("\n")
            cnt += 1
        else:
            print(e.name + "결과값이 없음")
            errorFile.write(e.name + '\n')
        print()
        time.sleep(0.2)

insertFile.close()
errorFile.close()
