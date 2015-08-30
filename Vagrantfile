Vagrant.configure(2) do |config|
  config.vm.box = "ubuntu/trusty64-juju"
  config.vm.network "forwarded_port", guest: 3306, host: 3306

  config.vm.provision "docker" do |d|
    d.pull_images "mysql"
    d.run "mysql",
    args: "-e 'MYSQL_ROOT_PASSWORD=awdf12' -p '3306:3306'"
  end
end
