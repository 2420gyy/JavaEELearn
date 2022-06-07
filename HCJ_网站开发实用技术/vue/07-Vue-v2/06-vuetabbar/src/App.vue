<template>
  <div id="nav">
	  <!-- 路由出口 -->
	  <!-- 路由匹配到的组件将渲染在这里 -->
	<router-view/>
	  
	   <!--使用 router-link 组件进行导航 -->
	   <!--通过传递 `to` 来指定链接 -->
	   <!--`<router-link>` 将呈现一个带有正确 `href` 属性的 `<a>` 标签-->
	   <!-- 在不重新加载页面的情况下更改 URL，处理 URL 的生成以及编码 -->
	   <!-- <router-link to="/">Home</router-link> |
	   <router-link to="/about">About</router-link> -->
	<Maintabbar></Maintabbar>
  </div>
  
</template>
<script>
	import Maintabbar from './components/Maintabbar.vue'
	export default{
		name:'App',
		components:{
			Maintabbar
		}
	}
</script>

<style>
	@import url("assets/css/base.css");
	
</style>
