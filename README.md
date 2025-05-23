# 合肥大学数据库程序设计报告
合肥大学
原作者地址：
https://gitee.com/LIULIN12345/database-course-design
本人魔改该人的课设，感谢分享
## 课设题目

健康档案管理系统

## 题目要求

功能要求该系统的健康文件包括病历信息和体检信息。


登记，将学生的健康信息插入健康文件；修改，修改一个学生的健康档案记录；

删除，删除学生的健康档案记录；

查询，可以组合各种条件进行查询，显示学生健康信息并打印健康文件报表；

统计，对学生的基本健康状况进行各种必要的统计和分析，由一般统计和动态分析两种。一般统计包括计数和求平均值；动态分析由健康历史求出平均年增长值和年增长率。

数据要求体检文件：学号、姓名、性别、系别、年龄、身高、体重、胸围、日期

病历文件：学号、姓名、性别、系别、诊断、日期

## 项目采用框架及开发平台介绍

采用框架：springboot+vue的前后端分离，mybaits

开发平台：IntelliJ IDEA

数据库版本：MySQL

JDK版本：jdk1.8

环境配置：Maven，Tomcat，lombook，devtools...（IDEA自动导入）

数据库管理与设计工具：Navicat Premium

### IntelliJ IDEA

IDEA全称IntelliJ IDEA,是java编程语言开发的集成环境。IntelliJ在业界被公认为最好的java开发工具，尤其在智能代码助手、代码自动提示、重构、JavaEE支持、各类版本工具（git、svn等）、JUnit、CVS整合、代码分析、创新的GUI设计等方面的功能可以说是超常的。

### MySQL

MySQL是一种关系型数据库管理系统，关系数据库将数据保存在不同的表中，而不是将所有数据放在一个大仓库内，这样就增加了速度并提高了灵活性。MySQL所使用的SQL语言是用于访问数据库的最常用标准化语言。MySQL软件采用了双授权政策，分为社区版和商业版，由于其体积小、速度快、总体拥有成本低，尤其是开放源码这一特点，一般中小型网站的开发都选择MySQL作为网站数据库。

### Navicat Premium

Navicat premium是一款数据库管理工具，是一个可多重连线资料库的管理工具，它可以让你以单一程式同时连线到MySQL、SQLite、Oracle、
MariaDB、Mssql、及PostgreSQL资料库，让管理不同类型的资料库更加的方便。

### Springboot

Spring框架是Java平台上的一种开源应用框架，提供具有控制反转特性的容器。SpringBoot是基于Spring4.0设计，不仅继承了Spring框架原有的优秀特性，而且还通过简化配置来进一步简化了 Spring应用的整个搭建和开发过程。

### Vue

Vue.js是一套构建用户界面的渐进式框架。与其他重量级框架不同的是，Vue采用自底向上增量开发的设计。Vue的核心库只关注视图层，并且非常容易学习，非常容易与其它库或已有项目整合。另一方面，Vue完全有能力驱动采用单文件组件和Vue生态系统支持的库开发的复杂单页应用。Vue.js的目标是通过尽可能简单的API实现响应的数据绑定和组合的视图组件。Vue.js自身不是一个全能框架--它只聚焦于视图层。因此它非常容易学习，非常容易与其它库或已有项目整合。另一方面，在与相关工具和支持库一起使用时，Vue.js也能完美地驱动复杂的单页应用

### Mybaits

MyBatis是一款优秀的持久层框架，它支持定制化SQL、存储过程以及高级映射。MyBatis避免了几乎所有的JDBC代码和手动设置参数以及获取结果集。MyBatis可以使用简单的XML或注解来配置和映射原生信息，将接口和Java的POJOs（Plain Ordinary Java Object,普通的Java对象）映射成数据库中的记录。

## 数据库E-R图及物理模型

### E-R图

![输入图片说明](https://images.gitee.com/uploads/images/2021/0626/192136_26d8516e_6511422.png "ER.png")

### 物理模型

![输入图片说明](https://images.gitee.com/uploads/images/2021/0626/192415_e75cf6cc_6511422.png "数据库模型.PNG")


## 编码结构和项目模板说明

### 后端文件结构模板说明

分为四层，controller层，DAO层，entity层，service层

#### controller层(控制器）

有四个模块的的控制层，可解决跨域的问题，学生（Student）、体检（Medical)、病历（Diagnosis)。可实现前后端的信息交互，控制服务层的类对象的判断以及控制信息输出。

#### DAO层（接口）

分别也是有四个模块。是操作数据库的接口层，接口可在开发的过程中能分离工作的内容，规范化的代码可提高其重复使用的特性，能让其项目完整以及项目的运行效率提高。

#### enity层(实体类)

有四个模块对应数据库在项目中当中的类，可为其他层提供类对象。

#### Service层(服务接口以及实现）

四个模块8个文件，一个模块有一个服务*service.java和业务*servicelmpl.java。Service层主要负责业务模块的逻辑应用设计。和DAO层一样都是先设计接口，再创建要实现的类，然后在配置文件中进行配置其实现的关联。接下来就可以在service层调用接口进行业务逻辑应用的处理。封装Service层的业务逻利于业务逻辑的独立性和重复利用性，servicelmpl文件就是实现service中的服务对象。

#### DAOMapper.xml

封装以及放置SQL语句的配置文件。

#### application.yml

springboot的配置文件

## 总结

通过这几天的网上学习，同学指点以及老师给的资料。我对前端和后端有了一定的了解，并基本完成了健康档案管理系统项目。说实话这个项目的大部分知识都是在网上一点一点学的，这虽然很重要。但我认为最重要的是，当我网上教程看不懂时，同学和室友总能给我详细的解答，这也是我最喜欢的过程。当我快完成时，室友看了一下我的代码提醒道“你的前端和后端没有完全分离，还要再改改”最后虽然我重写了一遍（也不算重写，代码都在，只是加了一些框架和其他相关代码）但可能是觉得快弄完了，就行前后端分离时，老是出错（有的代码分快的“}）”少写，有的代码input我弄成iput等等好些错误，花了我很长时间，差点自闭了）

待改进的地方：
前后端分离耗时较长，导致界面叫简单，很多细节没处理好。
学习springboot,vue等等，弄得我头都要炸了，所以晚上写的日志就有点简单（日志上随便一段代码，我可能要花两三个小时去写和找错）
gitee上贡献点不够，邮箱没有绑定仓库，导致有提交记录，没有贡献点。
