# Ireland Tours
Pet project by Roman Wyhowski

--
####Requirements
1) [Vagrant] (https://www.vagrantup.com/)
2) [VirtualBox] (https://www.virtualbox.org/)
--
####Instalation
```
$: git clone https://github.com/RobbyWD/ireland.git
```
--
####Run
```shell
# for first time
$: cd ireland && vagrant up && mvn clean install
# or 
$: vagrant up --no-provision && sleep 10 && vagrant provision
```

Command ```shell vagrant resume --provision ``` to start vagrant with mysql container does not work.