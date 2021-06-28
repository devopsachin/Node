from ubuntu
arg DEBIAN_FRONTEND=noninteractive
run apt update
run apt install npm -y
run npm install express -g
run apt install git -y
run git clone https://github.com/devopsachin/Node.git
workdir NodeJS-Sample-App/EmployeeDB
run apt install node-express-generator -y
cmd express -c stylus
run npm install -d
expose 3000
entrypoint ["node", "app.js"]
