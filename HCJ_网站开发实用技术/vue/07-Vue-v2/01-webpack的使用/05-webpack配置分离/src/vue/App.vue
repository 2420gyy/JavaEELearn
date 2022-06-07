<template>
	<div>
		<h3 class="title">{{message}}</h3>
		<h2>{{name}}</h2>
		<Cpn></Cpn>
	</div>
</template>

<!-- 
App.vue作为主的，然后引入其他.vue组件做子组件
 使用：	1.import Cpn from './Cpn.vue'
		2.components:{ Cpn },
		3.<Cpn></Cpn>
在main.js里面 : import App from './vue/App.vue'
把App.vue作为模板：template:'<App/>',最终覆盖index.js里面的<div id="app"></div>
 -->
<script>
	// 后缀名省略问题： 在alies上面：extensions:['.js','.css','.vue']
	import Cpn from './Cpn.vue'
	export default{
		name:"App",
		components:{
			Cpn
		},
	data(){
		return{
			message:"hello ",
			name:"codewhy"
		}
	}
}
</script>

<style>
	.title{
		color: #FFC0CB;
	}
</style>
