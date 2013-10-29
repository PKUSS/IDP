Ext.application({
  name:'Pku',
  appFolder:'app',
  controllers:['Framework','Users'],
  launch:function(){
   Ext.create('Ext.container.Viewport',{
             layout:'border',
			 items: [{xtype:'top'},
					{xtype:'sidepanel'},
					{xtype:'mainpanel'},
					{xtype:'bottom'}
	            ]
   });
  }  
});