--------------------------------------------------------
--  File created - Perþembe-Ocak-14-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table USERS
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."USERS" 
   (	"USERNAME" CHAR(50 BYTE), 
	"PASSWORD" CHAR(50 BYTE), 
	"ROL" NUMBER
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into SYSTEM.USERS
SET DEFINE OFF;
Insert into SYSTEM.USERS (USERNAME,PASSWORD,ROL) values ('admin                                             ','admin                                             ','0');
Insert into SYSTEM.USERS (USERNAME,PASSWORD,ROL) values ('user                                              ','1234                                              ','1');
Insert into SYSTEM.USERS (USERNAME,PASSWORD,ROL) values ('tarkan                                            ','1234                                              ','1');
Insert into SYSTEM.USERS (USERNAME,PASSWORD,ROL) values ('tarkan1                                           ','1234                                              ','1');
