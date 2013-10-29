Ext.define('Pku.controller.Users',{
     extend:'Ext.app.Controller',
	 views:[
	     'user.List',
		 'user.Edit'
	 ],
	 stores:['Users'],
	 models:['User'],
	 init:function(){
	     this.control({
		 'mainpanel>userlist':{
		 itemdblclick:this.editUser
		 },
		 'useredit button[action=save]':{
		 click:this.updateUser
		 }
		 });
		 this.getUsersStore().load();
	 	 },
	 editUser:function(grid,record){
	     // console.log('双击了'+record.get('name'));
		 var view = Ext.widget('useredit');
		 view.down('form').loadRecord(record);
	 },
	 updateUser:function(button){
	    console.log('点击了保存按钮');
		var win = button.up('window'),
		form = win.down('form'),
		record = form.getRecord(),
		values = form.getValues();
		
		record.set(values);
		win.close();
		this.getUsersStore().sync();
	 }
});