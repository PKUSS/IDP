Ext.define('Pku.view.framework.SidePanel',{
	extend:'Ext.panel.Panel',
	title:'功能区',
	alias:'widget.sidepanel',
	collapsible: true,
	split:true,
	width:200,
	layout:'accordion',
	region:'west',
	layoutConfig: {          
        titleCollapse: true,    //设置为点击整个标题栏都可以收缩     
        animate: true,  //开启默认动画效果         
        activeOnTop: true   //展开的面板总是在最顶层        
    },
    items:[
    	{  
            title:'系统用户',
            items:[
            	{
            		xtype:'button',
            		id:'userManagement',
					width:'100%',
            		text:'用户管理'
            	},
				{
            		xtype:'button',
            		width:'100%',
            		id:'userRoleManagement',
            		text:'用户角色管理'
            	},
				{
            		xtype:'button',
            		width:'100%',
            		id:'permissionSet',
            		text:'权限分配'
            	}
            ]
        },{  
            title:'项目管理',  
            html:'项目管理选项'  
        },{  
            title:'内容管理',  
            html:'内容管理选项'  
        },{
        	title:'系统设置',
        	html:'系统设置选项'
        }
    ]
});