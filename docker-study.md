## spring boot

### docker
1. #### 简介

   Windows镜像系统：

   docker类似 Windows镜像系统

   将已经安装好的软件，打包成一个镜像，其他环境想要对应的环境只需要，运行镜像。

   启动时间相对虚拟机快。

2. #### docker的核心概念

   docker主机：安装了docker的程序机器

   客户端：连接主机进行操作

   仓库：保存打包好的镜像

   镜像：打包好的镜像

   容器：镜像启动以后的事例称为一个容器

   使用步骤：

   	1. 安装
    	2. 从仓库找到镜像
    	3. 使用docker运行镜像，就会生成一个容器
    	4. 容器的启动、停止，就是对软件的启动停止

3. #### docker安装常用命令

   ~~~ shell
   1. 检查内核版本3.10以上
   uname -r
   2. 安装docker
   yum install docker
   3. 启动 docker
   systemctl start docker
   4. 开机启动docker
   [root@localhost ~]# systemctl enable docker
   Created symlink from /etc/systemd/system/multi-user.target.wants/docker.service to /usr/lib/systemd/system/docker.service.
   5. 停止docker
   [root@localhost ~]# systemctl stop docker
   ~~~

4. #### docker操作命令

   ``` shell
   1. 搜索镜像，docker hub 搜索
   docker search mysql
   2. 下载，默认最新tag（版本）
   docker pull "name":"tag" 如：mysql:5.5
   3. 查看已有镜像
   docker images
   4. 删除镜像
   docker rmi "镜像id"
   ```

5. #### docker的容器操作

   ```shell
   1. 搜索镜像
   docker search tomcat
   2. 拉取镜像
   docker pull tomcat
   3. 根据镜像启动容器
   docker run --name "自定义名字" -d（后台运行） "镜像名：tag"
   4. docker ps 查看运行中的容器
   5. 停止/停止容器
   docker stop/start id/name
   6. 查看所有容器
   docker ps -a
   7. 删除容器，容器一定是停止状态
   docker rm id/name
   8. 做一个能外部访问的容器，端口映射
   -p 主机端口：容器端口
   docker run -d -p 8888:8080 tomcat
   9. 防火墙关闭
   service firewalld status 查看
   service firewalld stop 临时关闭 
   10. 查看容器启动日志
   docker logs name/id
   
   更多命令，查看官网
   
   ```

   

6. #### 环境搭建

7. #### question 
    1. docker 的使用场景？
        1. 简化配置
            同一个docker的配置，可以在不同的环境中使用
        2. 代码的流水线管理
            docker提供从开发到上线一致的环境，让代码的流水线变得简单
        3. 

   