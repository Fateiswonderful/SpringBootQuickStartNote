

# 一、SpringBoot介绍

![image-20200717190100769](C:\Users\HP\Desktop\SpringBoot视频整理笔记\images\image-20200717190100769.png)


$$
591258221@qq.com整理         
$$

$$
大部分内容来自 2020最新版_SpringBoot视频——千锋
$$



### 1.1引言

> - 使用SSM需要维护大量的XML配置文件
> - 整合第三方框架，而去编写单独的xml文件
> - 为了使用SSM框架开发，准备SSM框架模板



### 1.2 SpringBoot介绍

> #### Springboot入门介绍
>
> #### Spring Boot 是由 Pivotal 团队提供的全新框架，其设计目的是用来简化新 Spring 应用的初始搭建以及开发过程。
>
> 一、Spring框架概述
>
> 1.1 什么是Spring
>
> Spring是一个开源框架，Spring是于2003 年兴起的一个轻量级的Java 开发框架，由Rod Johnson 在其著作《Expert One-On-One J2EE Development and Design》。Spring是为了解决企业级应用开发的复杂性而创建的，使用Spring可以让简单的JavaBean实现之前只有EJB才能完成的事情。但是Spring不仅仅局限于服务器端开发，任何Java应用都能在简单性、可测试性和松耦合性等方面从Spring中获益。
>
> 1.2 Spring是如何简化Java开发的
>
> 为了降低Java开发的复杂性，Spring采用了以下4种关键策略：
>
> 1、基于POJO的轻量级和最小侵入性编程；
>
> 2、通过依赖注入（DI）和面向接口实现松耦合；
>
> 3、基于切面（AOP）和惯例进行声明式编程；
>
> 4、通过切面和模版减少样式代码；
>
>  
>
> 二、SpringBoot简介
>
> 2.1什么是SpringBoot
>
> Spring Boot 是所有基于 Spring 开发的项目的起点。Spring Boot 的设计是为了让你尽可能快的跑起来 Spring 应用程序并且尽可能减少你的配置文件。简单来说就是SpringBoot其实不是什么新的框架，它默认配置了很多框架的使用方式，就像maven整合了所有的jar包，spring boot整合了所有的框架（不知道这样比喻是否合适）。
>
> 2.2、SpringBoot四个主要特性
>
> 1、SpringBoot Starter：他将常用的依赖分组进行了整合，将其合并到一个依赖中，这样就可以一次性添加到项目的Maven或Gradle构建中；
>
> 2、自动配置：SpringBoot的自动配置特性利用了Spring4对条件化配置的支持，合理地推测应用所需的bean并自动化配置他们；
>
> 3、命令行接口：（Command-line-interface, CLI）：SpringBoot的CLI发挥了Groovy编程语言的优势，并结合自动配置进一步简化Spring应用的开发；
>
> 4、Actuatir：它为SpringBoot应用的所有特性构建一个小型的应用程序。但首先，我们快速了解每项特性，更好的体验他们如何简化Spring编程模型。
>
> 2.3 SpringBoot开发的具体好处
>
> 回顾我们之前的 SSM 项目，搭建过程还是比较繁琐的，需要：
>
> 1、配置web.xml，加载spring和spring mvc
>
> 2、配置数据库连接、配置spring事务
>
> 3、配置加载配置文件的读取，开启注解



> SpringBoot特点
>
> - 创建独立的Spring应用程序
> - 直接嵌入Tomcat，Jetty或Undertow（无需部署WAR文件）
> - 提供自以为是的“入门”依赖项，以简化构建配置
> - 尽可能自动配置Spring和3rd Party库
> - 提供可用于生产的功能，例如指标，运行状况检查和外部化配置
> - 完全没有代码生成，也不需要XML配置



# 二、SpringBoot快速入门

### 2.1 快速构建SpringBoot

> ##### 创建默认的SpringBoot
>
> ![image-20200717192251435](C:\Users\HP\Desktop\SpringBoot视频整理笔记\images\image-20200717192251435.png)
>
> ![image-20200717192357242](C:\Users\HP\Desktop\SpringBoot视频整理笔记\images\image-20200717192357242.png)
>
> - Group:包名    如：com.deng.springboot
> - Artifact:项目名
> - package:SpringBoot启动类存放的包路径

```java
<dependency>
      	<groupId>org.springframework.boot</groupId>
      	<artifactId>spring-boot-starter</artifactId>
</dependency>
    <!--创建项目时未勾选，默认为SE项目  在Pom.xml中修改成以下结构-->
<dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
</dependency>
```



![UO0W](C:\Users\HP\Desktop\SpringBoot视频整理笔记\images\UO0W.png)

---------------

### 2.2 SpringBoot目录结构

> ``` 
> --src
> 	--main
> 		--java
> 			--包名
> 				--启动类
> 		--resources
> 			--static #存放静态资源
> 			--templates  #模板页面存放
> 			applicationContext.properties #SpringBoot提供唯一配置文件
> 		--test  #提供测试用的
> ```

--------------

### 2.3 SpringBoot的三种启动方式

#### 1.启动类main方法

#### 2.使用maven的命令 mvn spring-boot:run

#### 3.把项目打成jar包，命令行启动 java -jar  项目名



# 三、SpringBoot常用注解

### 3.1 @Configuration和@Bean 注解

> 之前使用SSM开发时,需要在XML文件里面使用<bean>标签注入bean实例
>
> 但是SpringBoot不推荐XML配置文件
>
> @Configuration  相当于<beans>标签
>
> @Bean相当于 <bean>标签
>
> XML配置文件中<bean>的id属性相当于user()方法名，或者@Bean(name="XXX")name属性的优先级更高
>
> XML配置文件中<bean>的class属性相当于User@Bean方法的返回值

```java
@Configuration              //代表当前类是一个配置类
public class UserConfig {
    //如果不给name属性,name默认为方法名
    @Bean(name = "user")
    public User user(){
        return new User(1,"张三");
    }
}
```

-----------

### 3.2 @SpringBootApplication 注解

> @SpringBootApplication是一个组合注解

> 1、@SpringBootConfiguration就是@Configuration注解，用于标注启动类是一个配置类

> 2、@EnableAutoConfiguration实现自动装配，SpringBoot工程启动时运行一个SpringFactoriesLoader
>
> 的类,加载META-INF/spring.factories配置类(已经开启的) ,通过SpringFactoriesLoader中的load方法,以for
>
> 循环的方式，一个一个加载。
>
> 好处:无需编写大量的整合配置信息,只需要安装SpringBoot



> 3、@ComponentScan就相当于context:component-scan basePackage="包名"/>帮助扫描注解的
>
> 这个注解只会扫描启动类之下的文件

# 四、SpringBoot常用配置

### 4.1 SpringBoot的配置文件格式

>  SpringBoot支持properties和YAML的配置文件，甚至支持JSON格式
>
>  SpringBoot更推荐使用YAML格式的配置文件
>
>  ​	1.yml文件，会根据换行和缩进帮助管理配置文件所在位置
>
>  ​	2.yml文件，相比properties跟轻量级
>
>  yml文件的劣势
>
>  ​	1.需要严格遵守换行和缩进
>
>  ​	2.在填写value时，一定要在:后面跟上一个空格

```yml

#设置端口号
server:
  port: 8081
#设置项目访问路径 http://localhost:8081/boot/   如果不配置访问路径则是 http://localhost:8081/
  servlet:
    context-path: /boot
```

-------------------

### 4.2 SpringBoot多环境运行Profile

```yml
#配置SpringBoot运行使用application-dev.yml的配置文件
spring:
  profiles:
    active: dev
```

```yml
#application-dev.yml配置文件
server:
  port: 8081
  servlet:
    context-path: /dev
```

```yml
#application-prov.yml配置文件
server:
  port: 8082
  servlet:
    context-path: /prov
```

> ##### 多环境配置的多种方法
>
> SpringBoot默认使用application.properties或者application.yml的配置文件
>
> 1. 在application.yml中配置
>
>    spring:
>      profiles:
>        active: dev
>
> 2. 项目打成jar包启动时 (命令行)   java -jar 项目名  --spring.profiles.active=指定的环境     如：application-dev.yml
>
>    ：java -jar 项目jar包名  --spring.profiles.active=dev
>
>    ![unmnasd1](C:\Users\HP\Desktop\SpringBoot视频整理笔记\images\unmnasd1.PNG)

--------

### 4.3 引入外部配置文件

> 使用@value获取配置文件中的值
>
> ```yml
> picPath: D://images
> ```
>
> ```java
>  /**
>   * 测试使用@Value("${Yml属性的KEY}")获取yml中配置的值
>   */
> @Value("${picPath}")
>     String picPath;
> ```
>
> 使用@Component   @ConfigurationProperties(prefix ="aliyun")获取配置文件中的一批值
>
> ```yml
> aliyun:
>   xxxx: xxxxxxxx
>   yyyy: yyyyyyyy
>   aaaa: aaaaaaaa
>   bbbb: bbbbbbbb
>   cccc: cccccccc
> ```
>
> ```java
> @Component
> @ConfigurationProperties(prefix ="aliyun")
> @Data
> @NoArgsConstructor
> @AllArgsConstructor
> public class AliyunProperties {
>     private String xxxx;
>     private String yyyy;
>     private String aaaa;
>     private String bbbb;
>     private String cccc;
> 
> }
> ```
>
> ```java
> /**
>  * 测试@ConfigurationProperties(prefix ="aliyun")  注入Yml配置文件的值
>  */
>     @Autowired
>     AliyunProperties aliyunProperties;
> ```
>
> ```xml
> <!--加入该依赖，防止引入了@ConfigurationProperties(prefix ="aliyun")时横幅通知，不加也没有影响-->
>         <dependency>
>             <groupId>org.springframework.boot</groupId>
>             <artifactId>spring-boot-configuration-processor</artifactId>
>         </dependency>
> ```

------------

### 4.4 SpringBoot热加载/热部署

1. ```xml
   <!--热加载依赖--> 
   <dependency>
           <groupId>org.springframework.boot</groupId>
           <artifactId>spring-boot-devtools</artifactId>
   </dependency>
   ```

2. ![U7AKY7K4NZAQIP3HDKA](C:\Users\HP\Desktop\SpringBoot视频整理笔记\images\U7AKY7K4NZAQIP3HDKA.png)

   > 勾上红色箭头指向的Build project automatically

3. ![7_WBWISL](C:\Users\HP\Desktop\SpringBoot视频整理笔记\images\7_WBWISL.png)

   > 每次修改代码  Build 一下就完成热部署了，是不是很简单，避免了频繁的重启项目呢! 

 

# 五、SpringBoot整合MyBatis

### 5.1 XML方式SpringBoot整合MyBatis

> 1.导入依赖

```xml
       <!--mysql驱动-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        <!--阿里巴巴druid连接池-->
        <!-- https://mvnrepository.com/artifact/com.alibaba/druid-spring-boot-starter -->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid-spring-boot-starter</artifactId>
            <version>1.1.10</version>
        </dependency>

        <!--mybatis-->
        <!-- https://mvnrepository.com/artifact/org.mybatis/mybatis -->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.3.2</version>
        </dependency>
        <!--热加载依赖-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
        </dependency>
        <!--引入@ConfigurationProperties(prefix ="aliyun")是，防止通知-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-configuration-processor</artifactId>
        </dependency>
        <!--lombox插件生成Getter/Setter等方法-->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>

```



> 2.编写配置文件

```java
2.1.准备实体类

public class Schemata {

  private String catalogName;
  private String schemaName;
  private String defaultCharacterSetName;
  private String defaultCollationName;
  private String sqlPath;
  private String defaultEncryption;


  public String getCatalogName() {
    return catalogName;
  }

  public void setCatalogName(String catalogName) {
    this.catalogName = catalogName;
  }


  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }


  public String getDefaultCharacterSetName() {
    return defaultCharacterSetName;
  }

  public void setDefaultCharacterSetName(String defaultCharacterSetName) {
    this.defaultCharacterSetName = defaultCharacterSetName;
  }


  public String getDefaultCollationName() {
    return defaultCollationName;
  }

  public void setDefaultCollationName(String defaultCollationName) {
    this.defaultCollationName = defaultCollationName;
  }


  public String getSqlPath() {
    return sqlPath;
  }

  public void setSqlPath(String sqlPath) {
    this.sqlPath = sqlPath;
  }


  public String getDefaultEncryption() {
    return defaultEncryption;
  }

  public void setDefaultEncryption(String defaultEncryption) {
    this.defaultEncryption = defaultEncryption;
  }

}
```



```java
2.2.准备Mapper接口
    
/**
 * SchemataMapper 
 *
 * @author 邓伟诚
 * @date 2020/7/19 16:57
 */
public interface SchemataMapper {

    List<Schemata> findAll();
}
=======================================
//还需要在SpringBoot启动类中加入MyBatis注解扫描Mapper所在的包
    
@SpringBootApplication
@MapperScan(basePackages = {"com.deng.springboot.data.mapper"})
public class SpringbootStudyqianfeng02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyqianfeng02Application.class, args);
    }

}
```

```xml
2.3. 准备映射文件
<?xml version="1.0" encoding="utf-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.deng.springboot.data.mapper.SchemataMapper">
<!--public List<Schemata> findAll();-->
    <select id="findAll" resultType="Schemata">
        select*from schemata
    </select>
</mapper>

 
```

```yml
#2.4. 配置
#配置数据库连接参数
spring:
  datasource:
      driver-class-name: com.mysql.cj.jdbc.Driver
      #?serverTimezone=UTC指定时区   UTC东八区
      url: jdbc:mysql:///information_schema?serverTimezone=UTC    
      username: root
      password: 990412
      type: com.alibaba.druid.pool.DruidDataSource
#Mybatis配置
mybatis:
#扫描mapper映射文件
  mapper-locations: classpath:mapper/*.xml   
 # 配置别名扫描包   resultType
  type-aliases-package: com.deng.springboot.data.entity   
#启用驼峰映射配置
  configuration:
    map-underscore-to-camel-case: true  
```



> 3.测试
>
> ![9JS4FBI79](C:\Users\HP\Desktop\SpringBoot视频整理笔记\images\9JS4FBI79.png)
>
> - #### 在需要测试的接口类名上右键，按图片步骤，他会自动创建测试类在Test目录下
>
> - #### 让当前测试类继承Springboot生成的主测试类
>
> - #### 继承时需要在主测试类中加入Public 作用域

```java
/**
 * @author 邓伟诚
 * @date 2020/7/19 17:53
 */
class SchemataMapperTest extends SpringbootStudyqianfeng02ApplicationTests {

    @Autowired
    SchemataMapper mapper;

    @Test
    void findAll() {
        List<Schemata> all = mapper.findAll();
        for (Schemata schemata : all) {
            System.out.println(schemata);
        }
    }
}
```



### 5.2 注解方式整合MyBatis

> #### 1、创建实体类的Mapper接口

> ##### 1.1.准备Mapper接口

```java
/**
 * @author 邓伟诚
 * @date 2020/7/19 18:27
 */
public interface SchemataMapper {

    public List<Schemata> findAll();
}

//============================
//扫描接口所在包路径
@SpringBootApplication
@MapperScan(basePackages = {"com.deng.springboot.data.mapper"})
public class SpringbootStudyqianfengAnnotionMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyqianfengAnnotionMybatisApplication.class, args);
    }

}
```

> ##### 1.2.准备配置文件

```yml
#mtbatis配置
mybatis:
  #支持配置文件和注解同时存在
  #mapper-locations: classpath:mapper/*.xml
  #type-aliases-package: com.deng.springboot.data.entity
  configuration:
    #启用驼峰配置,因为是注解形式所以无需扫描映射文件 和 别名映射
    map-underscore-to-camel-case: true
#数据库连接参数
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    type: com.alibaba.druid.pool.DruidDataSource
    url: jdbc:mysql:///information_schema?serverTimezone=UTC
    username: root
    password: 990412
#查看SQL语句
logging:
  level:
   #在Dao接口包添加Debug
    com.deng.springboot.data.mapper: debug
```



> #### 2、添加Mybatis注解
>
> 针对增删改查: @Insertil @Delete, @Update, @Select

```java
/**
 * @author 邓伟诚
 * @date 2020/7/19 18:27
 */
public interface SchemataMapper {

    public List<Schemata> findAll();

    
    @Select("select*from schemata where catalog_Name=#{name}")
    public Schemata queryOneById(@Param("name") String schemataName);
}
```

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.deng.springboot.data.mapper.SchemataMapper">
    <select id="findAll" resultType="Schemata">
        select*from schemata
    </select>
</mapper>
```

> #### 重点：支持mapper映射文件和MyBatis注解同时存在    代码如上：

> #### 3、测试，看到执行的sql语句。 

```java
/**
 * @author 邓伟诚
 * @date 2020/7/19 18:45
 */
class SchemataMapperTest extends SpringbootStudyqianfengAnnotionMybatisApplicationTests {
    @Autowired
    SchemataMapper schemataMapper;

    @Test
    void findAll() {
        List<Schemata> list = schemataMapper.findAll();
        for (Schemata schemata : list) {
            System.out.println(schemata);
        }
    }

    @Test
    void queryOneById() {
        List<Schemata> def = schemataMapper.queryOneById("def");
        System.out.println(def.toString());
    }
}
```

### 5.3 SpringBoot整合分页助手

> 1.导入依赖

```xml
   <!--PageHelper依赖-->
<dependency>
      <groupId>com.github.pagehelper</groupId>
      <artifactId>pagehelper-spring-boot-starter</artifactId>
      <version>1.2.5</version>
</dependency>

```

> 测试使用

```java
 @Test
    public void findByPage(){
        //使用PageHelper执行分页
        PageHelper.startPage(1,2);
        //执行查询
        List<Schemata> all = schemataMapper.findAll();
        //封装PageInfo对象
        PageInfo<Schemata>pageBean=new PageInfo<>(all);
        //输出
        for (Schemata schemata : pageBean.getList()) {
            System.out.println(schemata);
        }
    }
```



# 六、SpringBoot整合JSP

### 6.1 整合JSP

> 1.导入依赖

```xml
<!--JSP核心引擎依赖-->
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
        <!--JSTL-->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
        </dependency>
```



> 2.在项目的src/main创建webapp以及WEB-INF取存放JSP页面
>
> ![W3D3LPB](C:\Users\HP\Desktop\SpringBoot视频整理笔记\images\W3D3LPB.png)
>
> - 创建Html文件 修改后缀为jsp
>
> - 添加jsp的头文件
>
>   ```jsp
>   <%@ page import="java.util.*" contentType="text/html; charset=UTF-8"%>
>   ```



> 3.指定view的前缀和后缀  --视图解析器              
>
> --------------
>
> 3.1.完整的application.yml配置文件

```yml
spring:
  mvc:
    #视图的前后缀
    view:
      prefix: /WEB-INF/
      suffix: .jsp


```

> 3.2.控制器
>
> 直接注入mapper，中间忽略了业务层，为了代码规范请加上

```JAVA
/**
 * JspController class
 *
 * @author 邓伟诚
 * @date 2020/7/19 19:41
 */
@Controller
public class JspController {
    @Autowired
    SchemataMapper schemataMapper;

    @GetMapping("/index")
    public String getIndex(Model model){
        model.addAttribute("all",schemataMapper.findAll());//查询所有的Schemata,存放到请求范围
        return "index";//跳转到index.jsp页面
    }
}
```

> 3.3.JSP页面

```jsp
<%@ page import="java.util.*" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
        <c:forEach items="${all}" var="a">
            ${a}
        </c:forEach>
    <%-- 在页面简单输出了查询的结果--%>
</body>
</html>
```

### 6.2 整理 完整的依赖以及配置文件

> ####  6.2.1 整合MyBatis+JSP 完整依赖

```xml
  <!--mysql驱动-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>
        <!--阿里巴巴druid连接池-->
        <!-- https://mvnrepository.com/artifact/com.alibaba/druid-spring-boot-starter -->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid-spring-boot-starter</artifactId>
            <version>1.1.10</version>
        </dependency>

        <!--mybatis-->
        <!-- https://mvnrepository.com/artifact/org.mybatis/mybatis -->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.3.2</version>
        </dependency>
		<!--JSP核心引擎依赖-->
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
        </dependency>
        <!--JSTL-->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
        </dependency>
        <!--热加载依赖-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
        </dependency>
   		<!--PageHelper依赖-->
		<dependency>
      		<groupId>com.github.pagehelper</groupId>
      		<artifactId>pagehelper-spring-boot-starter</artifactId>
     		<version>1.2.5</version>
		</dependency>
        <!--引入@ConfigurationProperties(prefix ="aliyun")是，防止通知-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-configuration-processor</artifactId>
        </dependency>
        <!--lombox插件生成Getter/Setter等方法-->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
```

> 6.2.2 整合MyBatis+JSP 完整的配置文件

```yml
#mtbatis配置
mybatis:
  mapper-locations: classpath:mapper/*.xml
  type-aliases-package: com.deng.springboot.data.entity
  configuration:
    #启用驼峰配置,因为是注解形式所以无需扫描映射文件 和 别名映射
    map-underscore-to-camel-case: true


#数据库连接参数
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    type: com.alibaba.druid.pool.DruidDataSource
    url: jdbc:mysql:///information_schema?serverTimezone=UTC
    username: root
    password: 990412
  mvc:
    #视图的前后缀
    view:
      prefix: /WEB-INF/
      suffix: .jsp

#查看SQL语句
logging:
  level:
    com.deng.springboot.data.mapper: debug
```

### 6.3、Druid连接池oracle数据库

```yml
#mtbatis配置
mybatis:
  mapper-locations: classpath:mapper/*.xml
  type-aliases-package: com.deng.springboot.data.entity
  configuration:
    #启用驼峰配置,因为是注解形式所以无需扫描映射文件 和 别名映射
    map-underscore-to-camel-case: true


#数据库连接参数
spring:
  datasource:
    url: jdbc:oracle:thin:@localhost:1521:orcl
    username: scott
    password: 990412
	type: com.alibaba.druid.pool.DruidDataSource
  mvc:
    #视图的前后缀
    view:
      prefix: /WEB-INF/
      suffix: .jsp

#查看SQL语句
logging:
  level:
    com.deng.springboot.data.mapper: debugbf
```

### 6.4、c3p0连接池oracle数据库

```yml
#mtbatis配置
mybatis:
  mapper-locations: classpath:mapper/*.xml
  type-aliases-package: com.deng.springboot.data.entity
  configuration:
    #启用驼峰配置,因为是注解形式所以无需扫描映射文件 和 别名映射
    map-underscore-to-camel-case: true


#数据库连接参数
spring:
  datasource:
    url: jdbc:oracle:thin:@localhost:1521:orcl
    username: scott
    password: 990412

  mvc:
    #视图的前后缀
    view:
      prefix: /WEB-INF/
      suffix: .jsp

#查看SQL语句
logging:
  level:
    com.deng.springboot.data.mapper: debugbf
```



