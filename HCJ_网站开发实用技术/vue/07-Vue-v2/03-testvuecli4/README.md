# 03-testvuecli4

## Project setup
```
npm install
```

### Compiles and hot-reloads for development
```
npm run serve
```

### Compiles and minifies for production
```
npm run build
```

### Customize configuration
See [Configuration Reference](https://cli.vuejs.org/config/).
//运行的 serve
//编译，打包的时候用  build
//GUI方式 ： vue ui
//@VUE - cli-service -lib /.js
//修改配置 new一个vue.config.js

//路由-更改url请求而不会刷新页面
//location.hash = "foo"
//history.pushState({},'','home') - http://localhost:8080/home
//history.back() 出栈，先进后出
//history.replaceState({},'','home1') 会替换，无法返回
//history.back ==history.go(-1)
//history.forward()== history.go(1)
