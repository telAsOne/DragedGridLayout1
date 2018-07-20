/*数据库*/
CREATE DATABASE bilibili;

DROP DATABASE bilibili;

/*后台用户表*/
CREATE TABLE adminInfo(
	/*编号*/
	admin_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*用户名*/
	admin_name NVARCHAR(25) NOT NULL UNIQUE,
	/*用户密码*/
	admin_psw NVARCHAR(25) NOT NULL,
	/*用户状态*/
	admin_state NVARCHAR(10) NOT NULL DEFAULT '在职',
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME
)

/*后台角色表*/
CREATE TABLE roleInfo(
	/*编号*/
	role_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*角色名称*/
	role_name NVARCHAR(25) NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME
)

/*后台菜单表*/
CREATE TABLE menuInfo(
	/*编号*/
	menu_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*菜单名称*/
	menu_name NVARCHAR(50) NOT NULL ,
	/*菜单状态*/
	state NVARCHAR(25) NOT NULL,
	/*菜单对应的页面*/
	url NVARCHAR(50) NOT NULL,
	/*菜单的上级ID*/
	pid INT NOT NULL,
	/*菜单图片*/
	iconCls NVARCHAR(50) NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME 
)

/*后台用户角色对照表*/
CREATE TABLE adminorrole(
	/*编号*/
	ar_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*角色ID*/
	role_id INT NOT NULL,
	/*用户ID*/
	admin_id INT NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME 
)

/*角色菜单对照表*/
CREATE TABLE roleormenu(
	/*编号*/
	mo_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*角色ID*/
	role_id INT NOT NULL,
	/*菜单ID*/
	menu_id INT NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME 
)

/*用户表*/
CREATE TABLE userInfo(
	/*编号*/
	user_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*用户账号*/
	user_name NVARCHAR(25) NOT NULL,
	/*用户密码*/
	uer_psw NVARCHAR(25) NOT NULL,
	/*用户性别*/
	sex CHAR(4) NOT NULL,
	/*用户电话*/
	phone INT,
	/*用户等级*/
	user_level INT NOT NULL,
	/*用户积分*/
	integral INT NOT NULL,
	/*用户邮箱*/
	email NVARCHAR(25) UNIQUE,
	/*用户昵称*/
	nickname NVARCHAR(25) NOT NULL UNIQUE,
	/*录入数据的时间*/
	start_time DATETIME,
	/*最后登录时间*/
	end_login_time DATETIME NOT NULL,
	/*录入数据的时间*/
	end_time DATETIME,
	/*头像*/
	head_portrait VARCHAR(50) NOT NULL
)

/*视频评论表*/
CREATE TABLE videoreview(
	/*编号*/
	vr_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*用户ID*/
	user_id INT NOT NULL,
	/*用户评论内容*/
	vr_text NVARCHAR(150) NOT NULL,
	/*审核*/
	state NVARCHAR(10) NOT NULL DEFAULT '未审核',
	/*获赞数*/
	praises INT NOT NULL,
	/*回复那条数据ID*/
	reply INT NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME 
)

/*漫画评论表*/
CREATE TABLE comicoreview(
	/*编号*/
	cr_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*用户ID*/
	user_id INT NOT NULL,
	/*用户评论的内容*/
	cr_text NVARCHAR(150) NOT NULL,
	/*审核*/
	state NVARCHAR(10) NOT NULL DEFAULT '未审核',
	/*获赞数*/
	praises INT NOT NULL,
	/*回复那条数据ID*/
	reply INT NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME 
)

/*视频表*/
CREATE TABLE video(
	/*编号*/
	video_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*视频名*/
	video_name NVARCHAR(50) NOT NULL,
	/*视频封面图*/
	video_image NVARCHAR(50) NOT NULL,
	/*视频简介*/
	video_info NVARCHAR(500),
	/*上传者ID*/
	video_upOfUser INT,
	/*上传日期*/
	video_UpTime INT NOT NULL,
	/*播放次数*/
	playSum INT,
	/*收藏次数*/
	collectSum INT,
	/*获赞数*/
	supportSum INT,
	/*评论次数*/
	comentSum INT
)

/*漫画表*/
CREATE TABLE comic(
	/*编号*/
	comic_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*漫画名字*/
	comic_name NVARCHAR(100) NOT NULL,
	/*审核 检查约束值：1或2*/
	state NVARCHAR(10) NOT NULL DEFAULT '未审核',
	/*获赞数*/
	praises INT NOT NULL,
	/*漫画最新章*/
	chapter INT NOT NULL,
	/*漫画最新更新时间*/
	recently DATETIME NOT NULL,
	/*漫画简介*/
	information NVARCHAR(200) NOT NULL,
	/*漫画阅读数*/
	read_number INT NOT NULL,
	/*漫画打赏数*/
	gift_number INT NOT NULL,
	/*漫画打赏礼物*/
	gift INT NOT NULL,
	/*漫画头像*/
	portrait NVARCHAR(70) NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME 	
)

/*漫画章节表*/
CREATE TABLE comicchapter(
	/*编号*/
	cc_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*漫画章数*/
	chapter INT NOT NULL,
	/*漫画ID*/
	comic_id INT NOT NULL,
	/*漫画图片*/
	cartoon_pictures NVARCHAR(100) NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME 	
)

/*漫画分类表*/
CREATE TABLE comiclabel(
	/*编号*/
	cl_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*漫画分类标签*/
	cl_name NVARCHAR(50) NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME 	
)

/*视频分类表*/
CREATE TABLE videolabel(
	/*编号*/
	vl_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*视频类型*/
	vl_name NVARCHAR(50) NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME 	
)

/*漫画分类对照表*/
CREATE TABLE comicorlabel(
	/*编号*/
	col_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*漫画分类ID*/
	cl_id INT NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME 	
)

/*视频分类对照表*/
CREATE TABLE videoorlabel(
	/*编号*/
	vol_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*视频ID*/
	video_id INT NOT NULL,
	/*视频分类ID*/
	vl_id INT NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME
)

/*收藏表*/
CREATE TABLE collection(
	/*编号*/
	c_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*用户ID*/
	user_id INT NOT NULL,
	/*区分物品ID 检查约束值：1或2*/
	state INT NOT NULL,
	/*物品ID*/
	items_id INT NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME
)

/*用户浏览历史表*/
CREATE TABLE history(
	/*编号*/
	h_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*用户ID*/
	user_id INT NOT NULL,
	/*物品ID*/
	items_id INT NOT NULL,
	/*最近浏览时间*/
	TIME DATETIME NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME
)

/*关注表*/
CREATE TABLE attention(
	/*编号*/
	a_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*用户ID*/
	user_id INT NOT NULL,
	/*被关注的用户ID*/
	attention_user_id INT NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME
)

/*主贴表*/
CREATE TABLE topic(
	/*编号*/
	topic_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*标题*/
	title NVARCHAR(100) NOT NULL,
	/*用户ID*/
	user_id INT NOT NULL,
	/*发帖时间*/
	publishtime DATE NOT NULL,
	/*修改时间*/
	modifytime DATE NOT NULL,
	/*回复数*/
	replycount INT NOT NULL,
	/*点击数*/
	clickcount INT NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME
)

/*回帖表*/
CREATE TABLE reply(
	/*编号*/
	reply_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*标题*/
	title NVARCHAR(100) NOT NULL,
	/*用户ID*/
	user_id INT NOT NULL,
	/*发帖时间*/
	publishtime DATE NOT NULL,
	/*修改时间*/
	modifytime DATE NOT NULL,
	/*主贴编号*/
	topic_id INT NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME
)

/*聊天记录表*/
CREATE TABLE chat(
	/*编号*/
	chat_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*聊天内容*/
	chat_content NVARCHAR(200) NOT NULL,
	/*用户ID*/
	user_id INT NOT NULL,
	/*回复用户ID*/
	reply_user_id INT NOT NULL,
	/*回复指定消息*/
	specified INT NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME
)

/*用户聊天表*/
CREATE TABLE userChat(
	/*编号*/
	userchat_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*用户AID*/
	chat_userA INT NOT NULL,
	/*用户BID*/
	chat_userB INT NOT NULL,
	/*创建聊天的时间*/
	statr_time DATETIME NOT NULL,
	/*用户A消息列表是否包含此次聊天*/
	userA_look NVARCHAR(200) NOT NULL,
	/*用户B消息列表是否包含此次聊天*/
	userB_look NVARCHAR(200)
)

/*用户聊天详细记录表*/
CREATE TABLE userChatDetails(
	/*编号*/
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*聊天表（双人）id*/
	chat_id INT NOT NULL,
	/*消息内容*/
	news_text NVARCHAR(100) NOT NULL,
	/*创建聊天时间*/
	statr_time DATETIME NOT NULL,
	/*发送消息的用户*/
	user_send_msg_id INT(10) NOT NULL,
	/*接受消息的用户*/
	user_msg_id INT(10) NOT NULL	
)

/*用户登记记录表*/
CREATE TABLE user_record(
	/*编号*/
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*登录记录时间*/
	login_Time DATETIME NOT NULL,
	/*用户ID*/
	user_id INT NOT NULL,
	/*登录的设备IP*/
	ip_address VARCHAR(100) NOT NULL,
	/*登录的地址*/
	login_address VARCHAR(100) NOT NULL
)

/*用户创作中心菜单表*/
CREATE TABLE userRitingCenter(
	/*编号*/
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*上级菜单ID*/
	p_id INT NOT NULL,
	/*菜单名称*/
	menu_name VARCHAR(100) NOT NULL,
	/*图标*/
	image VARCHAR(100) NOT NULL,
	/*链接地址*/
	address VARCHAR(100) NOT NULL,
	/*是否打开 检查约束（只有值：1/2）*/
	is_open CHAR(1) NOT NULL
)

/*积分记录表*/
CREATE TABLE integralRecord(
	/*编号*/
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*用户ID*/
	user_id INT NOT NULL,
	/*历史操作时间*/
	operation_time VARCHAR(100) NOT NULL,
	/*积分变化*/
	integral_state INT NOT NULL,
	/*积分使用描述*/
	integral_describe VARCHAR(100) NOT NULL
)