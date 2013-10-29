Ext.define('Pku.controller.Framework',{
     extend:'Ext.app.Controller',
	 views:[
	     'framework.Top',
		 'framework.SidePanel',
		 'framework.MainPanel',
		 'framework.Bottom'
	 ],
	 init:function(){
	    // this.control({
		 //});
		 console.log('加载框架页');
	 	 }
});