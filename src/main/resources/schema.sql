CREATE TABLE RETAIL_INFO (
        RTL_NAME	varchar(100) not null,
        RTL_REG_NO	varchar(100) not null,
        RTL_PHONE	varchar(100),
        RTL_location geometry not null,
        RTL_USER_ID	varchar(100) not null,
        RTL_BHOURS	varchar(200),
        RTL_EXP	varchar(500),
        CONSTRAINT RETAIL_INFO_PK PRIMARY KEY (RTL_REG_NO)
);

CREATE TABLE PRODUCT_INFO (
        PDT_NAME	varchar(100) not null,
        PDT_COMPANY	varchar(100),
        PDT_YEAR	varchar(10),
        PDT_TYPE	varchar(10),
        PDT_COUNTRY	varchar(100),
        PDT_REGION	varchar(100),
        PDT_GRADE	varchar(5),
        PDT_IMAGE_URL	varchar(100),
        PDT_PRICE	varchar(20),
        PDT_EXP	varchar(500)
);

CREATE TABLE SHOP_INFO (
        SHP_REG_NO	varchar(100) not null,
        SHP_PDT_NAME	varchar(100) not null,
        CONSTRAINT SHOP_INFO_PK PRIMARY KEY (SHP_REG_NO, SHP_PDT_NAME)
);

CREATE TABLE USER_INFO (
        USR_ID	varchar(100) not null,
        USR_PWD	varchar(100) not null,
        USR_SNS	varchar(100),
        USR_NAME	varchar(50) not null,
        USR_PHONE	varchar(100) not null,
        USR_TYPE	varchar(10),
        CONSTRAINT USER_INFO_PK PRIMARY KEY (USR_ID)
);