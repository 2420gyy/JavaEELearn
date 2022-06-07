<template>
	<div>
		<h2>我是Profile组件</h2>
		<!-- 传递东西到这里来 -->
		<h3>{{$route.query.name}}</h3>
		<h3>{{$route.query.age}}</h3>
		<h3>{{$route.query.height}}</h3>
	</div>
</template>

<script>
</script>

<style>
</style>
