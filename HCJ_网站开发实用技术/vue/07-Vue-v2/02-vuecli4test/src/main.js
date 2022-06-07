// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  // components: { App },
  // template: '<App/>'
	render:function(createElement){
		return createElement('h2',{class:'box'},['hello-createElement方式',createElement('button',['套娃按钮'])])
	}
	// render:function(h){
	// 	return h(App);
	// }
	//1.createElement('标签',{标签的属性},[''])
	//2.createElement(组件)
	//
})
