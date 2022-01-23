#!/bin/bash
sudo apt update
echo "installing gitlab server key..."
sudo touch ~/.ssh/known_hosts
sudo chmod 777 ~/.ssh/known_hosts
sudo ssh-keyscan git.cardiff.ac.uk >> ~/.ssh/known_hosts
sudo chmod 644 ~/.ssh/known_hosts

echo "installing MariaDB..."
sudo apt update
sudo apt install mariadb-server -y
sudo systemctl start mariadb
sudo systemctl status mariadb
sudo systemctl enable mariadb

sudo apt update
sudo apt install wget -y
sudo apt install unzip -y
sudo apt install git -y

cat << `EOF` >> private_key.key
-----BEGIN OPENSSH PRIVATE KEY-----
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
-----END OPENSSH PRIVATE KEY-----
`EOF`
chmod 400 private_key.key
sudo ssh-agent bash -c 'ssh-add private_key.key; git clone git@git.cardiff.ac.uk:c2090580/team4_fitness_and_wellbeing_app.git;' -y



echo "Installing Java 11..."
sudo apt install default-jdk -y


echo "Installing gradle..."
sudo apt update
wget https://services.gradle.org/distributions/gradle-6.7.1-bin.zip
sudo mkdir /opt/gradle
sudo unzip -d /opt/gradle gradle-6.7.1-bin.zip
export PATH=$PATH:/opt/gradle/gradle-6.7.1/bin
export GRADLE_USER_HOME=$/home/debian
echo gradle -v




sudo chmod 777 ~/team4_fitness_and_wellbeing_app
cd team4_fitness_and_wellbeing_app


sudo mysql -u root -e "USE mysql; UPDATE user SET password=PASSWORD('comsc') WHERE User='root' AND Host = 'localhost'; FLUSH PRIVILEGES;"
sudo mysql -u root -pcomsc < Team4_Fitness_and_Wellbeing.sql
sudo mysql -u root -e "GRANT ALL PRIVILEGES ON *.* TO 'root'@'localhost' IDENTIFIED BY 'comsc' WITH GRANT OPTION;"




gradle build
gradle bootrun
