Ext.define('Pku.view.user.List',{
    extend:'Ext.grid.Panel',
	alias:'widget.userlist',
	title:'所有用户',
	store:'Users',
	initComponent:function(){
	  
	  this.columns=[
	     {header:'姓名',dataIndex:'name',flex:'1'},
		 {header:'邮箱/用户名',dataIndex:'email',flex:'1'}
	  ];
	  this.callParent(arguments);
	}
	});