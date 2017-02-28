/*

INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	('VDH-SEV', 'SECRET', 'openid,read,write,api.trust','password,authorization_code,refresh_token', NULL, NULL, 36000, 36000,NULL, true);
*/	
INSERT INTO oauth_client_details
	(client_id, client_secret, scope, authorized_grant_types,
	web_server_redirect_uri, authorities, access_token_validity,
	refresh_token_validity, additional_information, autoapprove)
VALUES
	("VDH-SEV", "d-L5oNUf,u+;k>2`FC7HiC,_e8p?pE'z-yWvN2HHpeLdU')AO/H5l=nw(!xSnN", "openid,read,write,api.trust",
	"password,authorization_code,refresh_token", null, null, 36000, 36000, null, true);
		