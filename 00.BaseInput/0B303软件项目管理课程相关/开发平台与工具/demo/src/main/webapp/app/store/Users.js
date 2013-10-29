Ext.define('Pku.store.Users',{
    extend:'Ext.data.Store',
	model:'Pku.model.User',
	
	proxy:{
		type:'ajax',
		api:{
			read: 'users',
			update:'updateUser'
		},
		reader:{
			type:'json',
			root:'users',
			successProperty:'success'
		},
		writer:{
			type:'json',
			root:'user'
		}
	}
});