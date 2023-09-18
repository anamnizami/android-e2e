set -ex
npm install -g appium@next
appium driver install uiautomator2
appium plugin install element-wait
appium -v
appium --use-plugin=element-wait --log appium.log &>/dev/null &
