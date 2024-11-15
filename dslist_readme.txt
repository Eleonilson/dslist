Dslist

postgresql://
postgres
:
WpLncRxRTyLAKdXGNlZgBrYlrcylEfdU
@
junction.proxy.rlwy.net
:
31323
/
railway

 APP_PROFILE
 DB_URL (Formato: jdbc:postgresql://junction.proxy.rlwy.net:31323/railway)
 DB_USERNAME
 DB_PASSWORD
 CORS_ORIGINS


SELECT TB_BELONGING .*, TB_GAME.TITLE FROM TB_BELONGING
INNER JOIN TB_GAME ON TB_GAME.ID = TB_BELONGING.GAME_ID
WHERE LIST_ID = 2
ORDER BY POSITION