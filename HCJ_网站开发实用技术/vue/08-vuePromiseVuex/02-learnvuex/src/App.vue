<template>
  <div id="app">
	  <h2>{{message}}</h2>
	  <h2 v-if="$store.state.counter && $store.state">{{$store.state.counter}}</h2>
	  <button @click="addition">+</button>
	  <button @click="this.$store.commit('decrement')">-</button>
	  <button @click="addCount(5)">+x</button><br />
	  <button @click="addStudent({id:105,score:50})">提交学生</button>
	  <HelloWorld></HelloWorld>
	  <h2>{{$store.getters.idScore}}</h2>
	  <h2>{{$store.getters.more70stuLength}}</h2>
	  <h2>{{$store.getters.more70stu(70)}}</h2>
	  <h2>响应式</h2>
	  <h2>{{$store.state.info}}</h2>
	  <button @click="aUpdataInfo">修改信息</button>
	  <h2>modulec的内容:{{$store.state.c.name}}</h2>
	  <button @click="aupdataName">修改C名字</button>
	  <h2>{{$store.getters.fullName}}</h2>
	  <h2>rootState:{{$store.getters.fullName3}}</h2>
	  <button @click="asyncUpdateName">子模块异步修改</button>
	  
  </div>
</template>


<!-- 
 父传子问题，ccounter是子组件里面的变量名称，
 在父组件中使用ccounter加v-bind绑定，
 -->
 
 <!-- 
  两个组件共享状态state,即counter
  假设没有关系，使用vuex
  全局单例模式
  官方建议的更改方法（mutations），可以记录每一次的更改（同步），异步操作，在action里面做，
  -->
  <!-- 
   提交commit可以传递参数,参数被称为载荷（Payload）
   提交风格：
   -->
   <!-- 
	响应式的前提，已经添加好了
	后来增加的不会刷新，cli4可以
	-->

<script>
	import HelloWorld from './components/HelloWorld.vue'
	export default{
		name:'App',
		components:{
			HelloWorld
		},
		data() {
			return{
				message:'App组件',
				// counter:0
			}
		},
		methods:{
			addition(){
				this.$store.commit('increment')
			},
			subtraction(){
				this.$store.commit('decrement')
			},
			addCount(count){
				// this.$store.commit('incrementCount',count)
				
				this.$store.commit({
					// type事件类型，这时count变成对象了
					type:'incrementCount',
					count
				})
			},
			// 参数被称为载荷（Payload）
			addStudent(stu){
				const stu1 = {id:106,score:40}
				this.$store.commit('addStu',stu)
			},
			aUpdataInfo(){
				// this.$store.commit('updataInfo')
				// this.$store.dispatch('asynchronousIncrement',{
				// 	message1:'携带的信息',
				// 	success:()=>{
				// 	console.log('里面已经完成')
				// 	}
				// })
				this.$store.dispatch('asynchronousIncrement',"携带的信息").then((res)=>{
					console.log('回调完成')
					console.log(res);
				})
			},
			aupdataName(){
				this.$store.commit('updatName','lisi')
		},
		asyncUpdateName(){
			this.$store.dispatch('cUpdataName')
		}
		}
	}
</script>

<style>
	
</style>
