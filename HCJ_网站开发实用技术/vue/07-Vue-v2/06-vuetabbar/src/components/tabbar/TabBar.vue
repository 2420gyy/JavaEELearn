<template>
	<div id="tab-bar">
		<slot></slot>
		
		<!-- <div class="tab-bar-item">
			<img src="../../assets/img/tabbar/home.png" />
			<div>首页</div></div>
		<div class="tab-bar-item">分类</div>
		<div class="tab-bar-item">购物车</div>
		<div class="tab-bar-item">我的</div> -->
	</div>
</template>

<script>
</script>

<style>
	#tab-bar{
		display: flex;
		background-color: #E9E9E9;
		position: fixed;
		left: 0;
		right: 0;
		bottom: 0;
		/* x右,y下,模糊程度， */
		box-shadow: 0px -1px 5px #5C6B77;
	}
</style>
