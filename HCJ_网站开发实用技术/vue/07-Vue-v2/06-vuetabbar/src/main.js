import { createApp } from 'vue'
import App from './App.vue'
import router from './router'

createApp(App).use(router).mount('#app')
// 5. 创建并挂载根实例
// const app = Vue.createApp({})
//确保 _use_ 路由实例使
//整个应用支持路由。
//通过调用 app.use(router)，我们可以在任意组件中以 this.$router 的形式访问它，并且以 this.$route 的形式访问当前路由：
// app.use(router)

// app.mount('#app')

