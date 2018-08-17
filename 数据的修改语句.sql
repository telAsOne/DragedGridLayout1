/*修改版本1.0.0*/
/*给视频分类表添加pid列，含义：上级分类的id，值为0则没有上级分类*/
alter table videolabel add column vl_pid int not null after vl_id;