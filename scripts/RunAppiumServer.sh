set -ex
npm install -g appium@next
appium driver install uiautomator2

appium -v
appium --log appium.log &>/dev/null &
