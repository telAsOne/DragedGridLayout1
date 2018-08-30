/*数据库*/
CREATE DATABASE bilibili;
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
);

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
);

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
);

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
);

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
);

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
);

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
);

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
);

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
);

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
);

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
);

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
);
/*视频分类表*/
CREATE TABLE videolabel(
	/*编号*/
	vl_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*上级分类id*/
	vl_pid INT NOT NULL,
	/*视频类型*/
	vl_name NVARCHAR(50) NOT NULL,
	/*录入数据的时间*/
	start_time DATETIME,
	/*录入数据的时间*/
	end_time DATETIME 	
);

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
);

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
);

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
);

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
);

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
);

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
);

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
);

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
);

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
);

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
);

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
);

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
);

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
);
 
 /*首页话题列表*/
CREATE TABLE slideImg(
	/*编号*/
	slide_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*图片标题*/
	slide_title NVARCHAR(50) NOT NULL,
	/*内容*/
	slide_content NVARCHAR(100) NOT NULL,
	/*是否显示在首页*/
	IsShow INT NOT NULL,
	/*图片路径*/
	ImageUrl NVARCHAR(120) NOT NULL,
	/*是否启用*/
	IsEnabled INT NOT NULL,
	linkAddress VARCHAR(100),
 /*创建时间*/
 start_time DATETIME ,
 /*最后修改时间*/ 
 end_time DATETIME 
);

/*系統消息通知表*/
CREATE TABLE SystemMessage
(	
	/*编号*/
	stM_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	/*标题*/
	stM_title VARCHAR(100) NOT NULL,
	/*内容*/
	stM_content VARCHAR(500) NOT NULL,
	/*跳转网址*/
	stM_skipUrl VARCHAR(50) NOT NULL,
	/*发布时间*/
	stM_releaseTime DATETIME
	
);

create table userjoin
(
  /*id 自动增长 */
  id int primary key auto_increment,
  /* 粉丝，来自用户信息表  */
  joinfrom int,
  /* 作者，来自用户信息表  */
  jointo   int
);




/*草稿表*/
CREATE  TABLE draft(
	#主键
	draft_id INT PRIMARY KEY	AUTO_INCREMENT,
	#用户
	id  INT,
	#标题图片
	draft_img   longtext NOT NULL,
	#标题
	draft_title     NVARCHAR(100) NOT NULL,
	#内容
	draft_content   NVARCHAR(500) NOT NULL,
	#标签
	draft_label   NVARCHAR(100),   	 
	start_time  DATETIME,
	#最后修改时间
	end_time DATETIME
);


/*用户日常表(相当于qq里的说说)*/
CREATE TABLE daily(
	#日常主键	id  
	 daily_id  INT  PRIMARY KEY AUTO_INCREMENT ,     				
	#用户id  
     daily_user_id INT  ,  					
	#连接日常评论表的id   
	daily_comments_id  	INT ,
	#日常图片地址
        daily_imgAddress    NVARCHAR(300)  NOT NULL,
	#日常内容  //注意： 字段类型  TEXT      VARCHAR表示不了
	daily_content      TEXT,			
	#是否可转发(使用检查约束)1表示可以转发，2表示不可转发
	 daily_WhetherForwarded CHAR  CHECK (daily_WhetherForwarded IN('1','2')) ,		  
	#点赞数
	daily_praiseNumber  INT,
	#浏览数  
	 daily_browse_number  INT,
	#收藏数 
	daily_collection_number	INT,
	//标签
	label varchar(300),					
	#审核是否通过 1代表通过、2代表不通过，3代表审核中(默认约束 3)
	 daily_audit  CHAR CHECK(daily_audit IN('1','2','3')) , 	
	#收藏夹分类 		这个字段是（5）
	favorites_classification	INT, 	 
	#创建时间
	start_time  DATETIME,
	#最后修改时间
	end_time DATETIME
);

/*日常评论表 dailyComments*/
CREATE TABLE dailyComments(
	#日常评论表id 主键
	    id   INT  PRIMARY 	KEY AUTO_INCREMENT,			
	#连接日常表 
	  daily_id    		INT, 
	#用户Aid
	 user_comments_A    INT ,
	#用户Bid 
	 user_comments_B   INT ,
	#评论内容
	  content    NVARCHAR(300)   NOT NULL,
	#创建时间
	start_time  DATETIME,
	#最后修改时间
	end_time DATETIME
);


/*绘画表*/
CREATE TABLE painting(
	#绘画主键id   主键INT
	painting_id    INT PRIMARY KEY AUTO_INCREMENT,     					
	#用户id
	painting_user_id  INT,
	#连接绘画评论表的id 
	painting_comments_id  	INT,
	#绘画图片地址
	painting_imgAddress	NVARCHAR(300) NOT NULL,
	#绘画内容//注意： 字段类型  TEXT        VARCHAR表示不了
	painting_content        TEXT,			   
	#是否可转发(使用检查约束)1表示可以转发，2表示不可转发
	painting_WhetherForwarded   CHAR CHECK(painting_WhetherForwarded IN('1','2')),			
	#点赞数
	painting_praiseNumber		INT ,
	#收藏数    	
	painting_collection_number	INT ,		
	#属性		
	painting_attribute  	NVARCHAR(300),
	#分类        默认约束（4）因为4表示相簿分类
	painting_classification	INT DEFAULT 4,
	#浏览数        
	painting_browse_number	INT,		
	#资源标签          
	painting_sourceLabel_label    NVARCHAR(300),
	#其他标签          
	painting_otherLabel_label    NVARCHAR(300),
	#审核是否通过  	1代表通过、2代表不通过，3代表审核中(默认约束 3)
	painting_audit   CHAR CHECK(painting_audit IN('1','2','3')),
	#收藏夹分类 		这个字段是（5）
	favorites_classification	INT, 
	#创建时间
	start_time  DATETIME,
	#最后修改时间
	end_time DATETIME
);

/*绘画评论表  paintingComments*/

CREATE TABLE paintingComments(
	#绘画评论表id    主键
	id     INT PRIMARY KEY AUTO_INCREMENT,				
	#连接绘画表   
	daily_id    INT,	
	#用户Aid    
	user_comments_A  INT,	
	#用户Bid  
	user_comments_B   INT,		
	#评论内容        
	content     NVARCHAR(300) NOT NULL,		
	#创建时间
	start_time  DATETIME,
	#最后修改时间
	end_time DATETIME
);



/*专栏投稿表*/
CREATE TABLE columns(
	#专栏id    	主键
	column_id   INT PRIMARY KEY AUTO_INCREMENT,		
	#用户id
	user_id  INT,
	#专栏标题   
	column_title    NVARCHAR(300)  NOT NULL,
	#专栏标题图	
	column_imgTitle      longtext  NOT NULL, 
	#专栏内容    注意： 字段类型  TEXT
	column_content_address   varchar(300),   					
	#类型    
	column_type    NVARCHAR (300),
	#分类    
	column_classification    NVARCHAR (300),
	#收藏夹分类 		这个字段是（4）
	favorites_classification	INT, 
	#是否可转发	(使用检查约束)1表示可以转发，2表示不可转发
	column_WhetherForwarded  CHAR CHECK (column_WhetherForwarded IN('1','2')),	
	#审核是否通过  1代表通过、2代表不通过，3代表审核中   (默认约束 3)
	audit   CHAR CHECK(audit IN('1','2','3')), 
	#标签
	label varchar(300),	
	#阅读数量      
	reading_number     INT,
	#评论数量      
	comments_number     INT,
	#喜欢数量	
	like_number    INT, 	
	#收藏数量	
	collection_number     	INT,
	#创建时间
	start_time  DATETIME,
	#最后修改时间
	end_time DATETIME
);