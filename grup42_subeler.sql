--------------------------------------------------------
--  File created - Perþembe-Ocak-14-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table SUBELER
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."SUBELER" 
   (	"SUBENO" VARCHAR2(50 BYTE), 
	"SUBEADI" VARCHAR2(50 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into SYSTEM.SUBELER
SET DEFINE OFF;
Insert into SYSTEM.SUBELER (SUBENO,SUBEADI) values ('bid101','bilgi güvenliði koordinatörlüðü');
Insert into SYSTEM.SUBELER (SUBENO,SUBEADI) values ('bid102','network koordinatörlüðü');
Insert into SYSTEM.SUBELER (SUBENO,SUBEADI) values ('bid103','sistem koordinatörlüðü');
Insert into SYSTEM.SUBELER (SUBENO,SUBEADI) values ('bid105','cografi bilgi sistemleri koordnatörlüðü');
Insert into SYSTEM.SUBELER (SUBENO,SUBEADI) values ('bid104','donaným ve destek koordinatörlüðü');
Insert into SYSTEM.SUBELER (SUBENO,SUBEADI) values ('bid106','idari ve mali iþler koordinatörlüðü');
Insert into SYSTEM.SUBELER (SUBENO,SUBEADI) values ('bid107','yapay zeka koordinatörlüðü');
Insert into SYSTEM.SUBELER (SUBENO,SUBEADI) values ('bid111','idari mali iþler');
--------------------------------------------------------
--  DDL for Index SYS_C007350
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."SYS_C007350" ON "SYSTEM"."SUBELER" ("SUBENO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table SUBELER
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."SUBELER" ADD PRIMARY KEY ("SUBENO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
