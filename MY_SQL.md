# My App Sql


### Delete Clear Main Table
```delete_clear_main_table
DELETE FROM tbl_constraint_property;
DELETE FROM tbl_column_property;
DELETE FROM tbl_table_property;
```

### APP SECURITY PROJECT Table - Verified
```app_security_project_table
-- TABLE: APP_SECURITY_PROJECT
INSERT INTO tbl_table_property VALUES ('15588819811342', 'app_security_project', 'tbl', 'app_project', 'App security project information stroage');
-- COLUMN_PROPERTY
INSERT INTO tbl_column_property VALUES ('15588819811342', '15588819825408', 'app_project>id', 'BIGINT', '20', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15588819811342', '15588819825813', 'title', 'VARCHAR', '255', '0', '0', 'Project bundle or app package name');
INSERT INTO tbl_column_property VALUES ('15588819811342', '15588819823997', 'label', 'TEXT', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15588819811342', '15588819825097', 'details', 'TEXT', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15588819811342', '15588819832397', 'bundle', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15588819811342', '15588819835359', 'status', 'BOOLEAN', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15588819811342', '15588819836891', 'latest_code', 'VARCHAR', '255', '0', '0', 'Latest version code');
INSERT INTO tbl_column_property VALUES ('15588819811342', '15588819832858', 'latest_name', 'VARCHAR', '255', '0', '0', 'Latest version name');
INSERT INTO tbl_column_property VALUES ('15588819811342', '15588819838341', 'least_code', 'VARCHAR', '255', '0', '0', 'Least version code');
INSERT INTO tbl_column_property VALUES ('15588819811342', '15588819849637', 'least_name', 'VARCHAR', '255', '0', '0', 'Least version name');
INSERT INTO tbl_column_property VALUES ('15588819811342', '15588819845507', 'create_date', 'DATETIME', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15588819811342', '15588819841373', 'modified_date', 'DATETIME', null, '0', '0', null);
-- CONSTRAINT_PROPERTY
INSERT INTO tbl_constraint_property VALUES ('15588819825408', '15588819909926', 'PRIMARY', null, null);
INSERT INTO tbl_constraint_property VALUES ('15588819832397', '15588819913045', 'UNIQUE', null, null);
```


### APP SECURITY PROJECT KEY Table - Verified
```app_security_project_key_table
-- TABLE: APP_SECURITY_PROJECT_KEY
INSERT INTO tbl_table_property VALUES ('15588819814636', 'app_security_project_key', 'tbl', 'app_prokey', 'App security project key information stroage');
-- COLUMN_PROPERTY
INSERT INTO tbl_column_property VALUES ('15588819814636', '15588819842756', 'app_project>id', 'BIGINT', '20', '0', '1', null);
INSERT INTO tbl_column_property VALUES ('15588819814636', '15588819845044', 'app_projet_key>id', 'BIGINT', '20', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15588819814636', '15588819852186', 'use_type', 'VARCHAR', '255', '0', '0', 'Use for android or web');
INSERT INTO tbl_column_property VALUES ('15588819814636', '15588819852967', 'build_type', 'VARCHAR', '255', '0', '0', 'Debug key or release key');
INSERT INTO tbl_column_property VALUES ('15588819814636', '15588819858347', 'hash_algo', 'VARCHAR', '255', '0', '0', 'Sha1 or facebook key hash');
INSERT INTO tbl_column_property VALUES ('15588819814636', '15588819857300', 'key', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15588819814636', '15588819859145', 'status', 'BOOLEAN', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15588819814636', '15588819861506', 'create_date', 'DATETIME', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15588819814636', '15588819865008', 'modified_date', 'DATETIME', null, '0', '0', null);
-- CONSTRAINT_PROPERTY
INSERT INTO tbl_constraint_property VALUES ('15588819842756', '15588819916484', 'FOREIGN', '15588819811342', null);
INSERT INTO tbl_constraint_property VALUES ('15588819845044', '15588819914129', 'PRIMARY', null, null);
```









### FULL LIST OF Table
```full_list_of_table
DELETE FROM tbl_constraint_property;
DELETE FROM tbl_column_property;
DELETE FROM tbl_table_property;


-- TABLE: APP_SECURITY_PROJECT
INSERT INTO tbl_table_property VALUES ('15589005593267', 'app_security_project', 'tbl', 'app_project', 'App security project information stroage');
-- COLUMN_PROPERTY
INSERT INTO tbl_column_property VALUES ('15589005593267', '15589005619391', 'app_project>id', 'BIGINT', '20', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005593267', '15589005611622', 'title', 'VARCHAR', '255', '0', '0', 'Project bundle or app package name');
INSERT INTO tbl_column_property VALUES ('15589005593267', '15589005621637', 'label', 'TEXT', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005593267', '15589005626386', 'details', 'TEXT', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005593267', '15589005628401', 'bundle', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005593267', '15589005625224', 'status', 'BOOLEAN', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005593267', '15589005623840', 'latest_code', 'VARCHAR', '255', '0', '0', 'Latest version code');
INSERT INTO tbl_column_property VALUES ('15589005593267', '15589005632833', 'latest_name', 'VARCHAR', '255', '0', '0', 'Latest version name');
INSERT INTO tbl_column_property VALUES ('15589005593267', '15589005636131', 'least_code', 'VARCHAR', '255', '0', '0', 'Least version code');
INSERT INTO tbl_column_property VALUES ('15589005593267', '15589005637245', 'least_name', 'VARCHAR', '255', '0', '0', 'Least version name');
INSERT INTO tbl_column_property VALUES ('15589005593267', '15589005631293', 'create_date', 'DATETIME', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005593267', '15589005633980', 'modified_date', 'DATETIME', null, '0', '0', null);
-- CONSTRAINT_PROPERTY
INSERT INTO tbl_constraint_property VALUES ('15589005619391', '15589005775536', 'PRIMARY', null, null);
INSERT INTO tbl_constraint_property VALUES ('15589005628401', '15589005772664', 'UNIQUE', null, null);




-- TABLE: APP_SECURITY_PROJECT_KEY
INSERT INTO tbl_table_property VALUES ('15589005608768', 'app_security_project_key', 'tbl', 'app_prokey', 'App security project key information stroage');
-- COLUMN_PROPERTY
INSERT INTO tbl_column_property VALUES ('15589005608768', '15589005643622', 'app_project>id', 'BIGINT', '20', '0', '1', null);
INSERT INTO tbl_column_property VALUES ('15589005608768', '15589005641300', 'app_projet_key>id', 'BIGINT', '20', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005608768', '15589005647081', 'use_type', 'VARCHAR', '255', '0', '0', 'Use for android or web');
INSERT INTO tbl_column_property VALUES ('15589005608768', '15589005647323', 'build_type', 'VARCHAR', '255', '0', '0', 'Debug key or release key');
INSERT INTO tbl_column_property VALUES ('15589005608768', '15589005648177', 'hash_algo', 'VARCHAR', '255', '0', '0', 'Sha1 or facebook key hash');
INSERT INTO tbl_column_property VALUES ('15589005608768', '15589005656505', 'key', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005608768', '15589005658845', 'status', 'BOOLEAN', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005608768', '15589005658297', 'create_date', 'DATETIME', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005608768', '15589005652230', 'modified_date', 'DATETIME', null, '0', '0', null);
-- CONSTRAINT_PROPERTY
INSERT INTO tbl_constraint_property VALUES ('15589005643622', '15589005787722', 'FOREIGN', '15589005593267', null);
INSERT INTO tbl_constraint_property VALUES ('15589005641300', '15589005789130', 'PRIMARY', null, null);




-- TABLE: APP_SECURITY_PROJECT_TEMP
INSERT INTO tbl_table_property VALUES ('15589005604364', 'app_security_project_temp', 'tbl', 'app_proj_tmp', 'App security project temporary information stroage');
-- COLUMN_PROPERTY
INSERT INTO tbl_column_property VALUES ('15589005604364', '15589005655356', 'app_project_temp>id', 'BIGINT', '20', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005604364', '15589005664617', 'bundle', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005604364', '15589005664991', 'version_code', 'VARCHAR', '255', '0', '0', 'Version code');
INSERT INTO tbl_column_property VALUES ('15589005604364', '15589005666803', 'version_name', 'VARCHAR', '255', '0', '0', 'Version name');
INSERT INTO tbl_column_property VALUES ('15589005604364', '15589005669627', 'serial_num', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005604364', '15589005663469', 'use_type', 'VARCHAR', '255', '0', '0', 'Use for android or web');
INSERT INTO tbl_column_property VALUES ('15589005604364', '15589005676028', 'build_type', 'VARCHAR', '255', '0', '0', 'Debug key or release key');
INSERT INTO tbl_column_property VALUES ('15589005604364', '15589005677459', 'hash_algo', 'VARCHAR', '255', '0', '0', 'Sha1 or facebook key hash');
INSERT INTO tbl_column_property VALUES ('15589005604364', '15589005672907', 'key', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005604364', '15589005675360', 'create_date', 'DATETIME', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005604364', '15589005673336', 'modified_date', 'DATETIME', null, '0', '0', null);
-- CONSTRAINT_PROPERTY
INSERT INTO tbl_constraint_property VALUES ('15589005655356', '15589005783332', 'PRIMARY', null, null);




-- TABLE: DEVICE_INFORMATION
INSERT INTO tbl_table_property VALUES ('15589005601466', 'device_information', 'tbl', 'dev_info', 'Device information stroage');
-- COLUMN_PROPERTY
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005689266', 'app_projet_key>id', 'BIGINT', '20', '0', '1', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005684015', 'device_info>id', 'BIGINT', '20', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005686234', 'main_gen_unique_id', 'VARCHAR', '255', '1', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005689503', 'second_gen_unique_id', 'VARCHAR', '255', '1', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005684494', 'android_id', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005692471', 'serial_num', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005693190', 'build_num', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005697221', 'model_num', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005695108', 'build_hardware', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005697577', 'build_product', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005705396', 'build_user', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005705352', 'build_brand', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005706864', 'uuid', 'VARCHAR', '255', '1', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005706602', 'imei_num', 'VARCHAR', '255', '1', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005701530', 'iccid_num', 'VARCHAR', '255', '1', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005715861', 'build_incremental', 'VARCHAR', '255', '1', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005711228', 'status', 'BOOLEAN', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005713320', 'create_date', 'DATETIME', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601466', '15589005711370', 'modified_date', 'DATETIME', null, '0', '0', null);
-- CONSTRAINT_PROPERTY
INSERT INTO tbl_constraint_property VALUES ('15589005689266', '15589005789599', 'FOREIGN', '15589005608768', null);
INSERT INTO tbl_constraint_property VALUES ('15589005684015', '15589005797144', 'PRIMARY', null, null);




-- TABLE: DEVICE_MAC_ADDRESS
INSERT INTO tbl_table_property VALUES ('15589005601923', 'device_mac_address', 'tbl', 'dev_mac', 'Device mac information stroage');
-- COLUMN_PROPERTY
INSERT INTO tbl_column_property VALUES ('15589005601923', '15589005718602', 'device_info>id', 'BIGINT', '20', '0', '1', null);
INSERT INTO tbl_column_property VALUES ('15589005601923', '15589005721873', 'dev_mac_address>id', 'BIGINT', '20', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601923', '15589005727074', 'add_lan', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601923', '15589005728370', 'add_eth', 'VARCHAR', '255', '1', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601923', '15589005728417', 'status', 'BOOLEAN', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601923', '15589005725430', 'create_date', 'DATETIME', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005601923', '15589005731352', 'modified_date', 'DATETIME', null, '0', '0', null);
-- CONSTRAINT_PROPERTY
INSERT INTO tbl_constraint_property VALUES ('15589005718602', '15589005794810', 'FOREIGN', '15589005601466', null);
INSERT INTO tbl_constraint_property VALUES ('15589005721873', '15589005798181', 'PRIMARY', null, null);




-- TABLE: DEVICE_NETWORK_INFORMATION
INSERT INTO tbl_table_property VALUES ('15589005609791', 'device_network_information', 'tbl', 'dev_net', 'Device information stroage');
-- COLUMN_PROPERTY
INSERT INTO tbl_column_property VALUES ('15589005609791', '15589005732666', 'device_info>id', 'BIGINT', '20', '0', '1', null);
INSERT INTO tbl_column_property VALUES ('15589005609791', '15589005732916', 'device_network_information>id', 'BIGINT', '20', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005609791', '15589005733917', 'general_ip', 'VARCHAR', '255', '1', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005609791', '15589005737576', 'wifi_ip', 'VARCHAR', '255', '1', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005609791', '15589005749833', 'used_network_type', 'VARCHAR', '255', '1', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005609791', '15589005741572', 'status', 'BOOLEAN', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005609791', '15589005749763', 'create_date', 'DATETIME', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005609791', '15589005749772', 'modified_date', 'DATETIME', null, '0', '0', null);
-- CONSTRAINT_PROPERTY
INSERT INTO tbl_constraint_property VALUES ('15589005732666', '15589005792581', 'FOREIGN', '15589005601466', null);
INSERT INTO tbl_constraint_property VALUES ('15589005732916', '15589005792565', 'PRIMARY', null, null);




-- TABLE: DEVICE_VERSION_INFORMATION
INSERT INTO tbl_table_property VALUES ('15589005618388', 'device_version_information', 'tbl', 'dev_vers', 'Device information stroage');
-- COLUMN_PROPERTY
INSERT INTO tbl_column_property VALUES ('15589005618388', '15589005749639', 'device_info>id', 'BIGINT', '20', '0', '1', null);
INSERT INTO tbl_column_property VALUES ('15589005618388', '15589005753754', 'device_version_information>id', 'BIGINT', '20', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005618388', '15589005751811', 'build_sdk', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005618388', '15589005755378', 'release', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005618388', '15589005758414', 'os', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005618388', '15589005755271', 'status', 'BOOLEAN', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005618388', '15589005765526', 'create_date', 'DATETIME', null, '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005618388', '15589005761949', 'modified_date', 'DATETIME', null, '0', '0', null);
-- CONSTRAINT_PROPERTY
INSERT INTO tbl_constraint_property VALUES ('15589005749639', '15589005804941', 'FOREIGN', '15589005601466', null);
INSERT INTO tbl_constraint_property VALUES ('15589005753754', '15589005804267', 'PRIMARY', null, null);




-- TABLE: REQUEST_ACCESS_TRACKER
INSERT INTO tbl_table_property VALUES ('15589005617032', 'request_access_tracker', 'tbl', 'ratrack', 'Device or user network access tracker base on request');
-- COLUMN_PROPERTY
INSERT INTO tbl_column_property VALUES ('15589005617032', '15589005762021', 'device_info>id', 'BIGINT', '20', '1', '1', null);
INSERT INTO tbl_column_property VALUES ('15589005617032', '15589005761466', 'user_information>id', 'BIGINT', '20', '1', '1', null);
INSERT INTO tbl_column_property VALUES ('15589005617032', '15589005767295', 'reque_acc_tracker>id', 'BIGINT', '20', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005617032', '15589005778668', 'libs_ip', 'VARCHAR', '255', '0', '0', null);
INSERT INTO tbl_column_property VALUES ('15589005617032', '15589005776275', 'api_ip', 'VARCHAR', '255', '0', '0', null);
-- CONSTRAINT_PROPERTY
INSERT INTO tbl_constraint_property VALUES ('15589005762021', '15589005807849', 'FOREIGN', '15589005601466', null);
INSERT INTO tbl_constraint_property VALUES ('15589005761466', '15589005806461', 'FOREIGN', '15589005611443', null);
INSERT INTO tbl_constraint_property VALUES ('15589005767295', '15589005805273', 'PRIMARY', null, null);




-- TABLE: USER_INFORMATION_STORAGE
INSERT INTO tbl_table_property VALUES ('15589005611443', 'user_information_storage', 'tbl', 'user', 'User table');
-- COLUMN_PROPERTY
INSERT INTO tbl_column_property VALUES ('15589005611443', '15589005771276', 'user_information>id', 'BIGINT', '20', '0', '0', null);
-- CONSTRAINT_PROPERTY
INSERT INTO tbl_constraint_property VALUES ('15589005771276', '15589005815283', 'PRIMARY', null, null);
```

### Insert Sql
```insert_sql_table
DELETE FROM tbl_app_security_project;
INSERT INTO tbl_app_security_project VALUES ('15588641715656', 'Title Pocket Money', 'Pocket Money', 'Pocket Money Details', 'me.apphive.pocketmoney', '1', '10004', '1.00.04', '10000', '1.00.00', '2019-05-26 12:03:33', '2019-05-26 12:03:33');



DELETE FROM tbl_app_security_project_key;
INSERT INTO tbl_app_security_project_key VALUES ('15588641715656', '15588651906322', 'android', 'debug', 'sha1', '59:F6:B2:64:37:CC:4E:F8:89:AE:95:31:0E:D8:57:0C:3F:23:47:85', '1', '2019-05-26 12:06:30', '2019-05-26 12:06:30');
```


### IDEA LIST OF Table
```idea_list_of_table
Device Details
	pro_key_id
	ddetails_id
	ddetails_android_id
	dev_dtls_serial
	dev_dtls_build_num
	dev_dtls_model_num
	dev_dtls_build_hardware
	dev_dtls_build_product
	dev_dtls_build_user
	dev_dtls_build_brand
	dev_dtls_uuid
	dev_dtls_imei_num
	dev_dtls_iccid_num
	dev_dtls_build_incremental
	dev_dtls_main_gen_unique_id
	dev_dtls_second_gen_unique_id
Device Version
	dev_dtls_build_sdk_vers
	dev_dtls_release_vers
	dev_dtls_os_vers
Device Network
	dev_dtls_general_ip
	dev_dtls_wifi_ip
	dev_dtls_used_network_type
Device Mac Address
	dev_dtls_mac_address_lan
	dev_dtls_mac_address_eth
```






### End