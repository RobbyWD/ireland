Vagrant.configure(2) do |config|
  config.vm.box = "ubuntu/vivid64"
  
  config.vm.network "forwarded_port", guest: 3306, host: 3306

  config.vm.provider "virtualbox" do |v|
    v.memory = 1024
    v.cpus = 2 
  end

  config.vm.provision "docker" do |d|
    d.pull_images "mysql"
    d.run "mysql",
    args: "-e 'MYSQL_ROOT_PASSWORD=awdf12' -e 'MYSQL_DATABASE=ireland_travel' -v '/home/vagrant/mysql:/var/lib/mysql' -p '3306:3306'"
  end
end
