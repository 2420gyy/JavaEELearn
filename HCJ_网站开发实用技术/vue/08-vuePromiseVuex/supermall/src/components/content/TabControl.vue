<template>
	<div class="tab-control">
		<div v-for="(item,index) in titles" class="tab-control-item" 
		:class="{active: index === currentIndex}" @click="itemClick(index)">
			<span>{{item}}</span>
		</div>
	</div>
</template>
<!-- :class="{active: index === currentIndex}" 忘了 -->
<script>
	export default{
		name:"TabControl",
		props:{
			titles:{
				type:Array,
				default(){
					return []
				}
			}
		},
		data(){
			return{
				currentIndex:0
			}
		},
		methods:{
			itemClick(index){
				this.currentIndex = index;
			}
		}
	}
</script>

<style>
	.tab-control{
		display: flex;
		text-align: center;
		font-size: 15px;
		/* 粘性定位 */
		position: sticky;
		top: 44px;
	}
	.tab-control-item{
		flex:1;
		height: 40px;
		line-height: 40px;
	}
	.active{
		color: var(--color-high-text);
		
	}
	.active span{
		border-bottom: 3px solid var(--color-tint);
	}
	.tab-control-item span{
		padding: 3px;
	}
	
</style>
