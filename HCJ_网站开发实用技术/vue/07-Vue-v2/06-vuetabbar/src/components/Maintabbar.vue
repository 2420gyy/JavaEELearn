<template>
	<tab-bar>
	<!-- 父子组件传值 -->
	<tab-bar-item path="/home" textColor="red">
		<!-- <template #item-icon> -->
		<template v-slot:item-icon>
			<img src="~@/assets/img/tabbar/home.svg" />
		</template>
		<template v-slot:item-icon-active>
			<img src="~@/assets/img/tabbar/home_active.svg" />
		</template>
		<template v-slot:item-text>
			<div>首页</div>
		</template>
	</tab-bar-item>
	<tab-bar-item path="/category" textColor="red">
		<template v-slot:item-icon>
			<img src="~@/assets/img/tabbar/category.svg" />
		</template>
		<template v-slot:item-icon-active>
			<img src="~@/assets/img/tabbar/category_active.svg" />
		</template>
		<template v-slot:item-text>
			<div>分类</div>
		</template>
	</tab-bar-item>
	<tab-bar-item path="/cart" textColor="red">
		<template v-slot:item-icon>
			<img src="../assets/img/tabbar/shopcart.svg" />
		</template>
		<template v-slot:item-icon-active>
			<img src="../assets/img/tabbar/shopcart_active.svg" />
		</template>
		<template v-slot:item-text>
			<div>购物车</div>
		</template>
	</tab-bar-item>
	<tab-bar-item path="/profile" textColor="blue">
		<template v-slot:item-icon>
			<img src="../assets/img/tabbar/profile.svg" />
		</template>
		<template v-slot:item-icon-active>
			<img src="../assets/img/tabbar/profile_active.svg" />
		</template>
		<template v-slot:item-text>
			<div>我的</div>
		</template>
	</tab-bar-item>
	</tab-bar>
</template>

<script>
	import TabBar from './tabbar/TabBar.vue'
	import TabBarItem from './tabbar/TabBarItem.vue'
	export default{
		name:'Maintabbar',
		components:{
			TabBar,
			TabBarItem
		}
	}
</script>

<style>
	
	
</style>
