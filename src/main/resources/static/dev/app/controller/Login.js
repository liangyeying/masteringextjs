Ext.define('Packt.controller.Login', {
    extend: 'Ext.app.Controller',
    views: [
        'Login'
    ],
    refs: [
        {
            ref: 'capslockTooltip',
            selector: 'capslocktooltip'
        }
    ],
    init: function(application) {
        this.control({
            "login form button#submit": {
                click: this.onButtonClickSubmit
            },
            "login form button#cancel": {
                click: this.onButtonClickCancel
            },
            "login form textfield": {
                specialkey: this.onTextfieldSpecialKey
            },
            "login form textfield[name=password]": {
                keypress: this.onTextfieldKeyPress
            }
        })
    },
    onButtonClickSubmit: function(button, e, options) {
        var formPanel = button.up('form'), 
        login = button.up('login'), 
        user = formPanel.down('textfield[name=user]').getValue(),
        pwd = formPanel.down('textfield[name=password]').getValue();
        if (formPanel.getForm().isValid()) {
            // 遮罩层
            Ext.get(login.getEl()).mask("正在登录... 请耐心等待...", 'loading');
            Ext.Ajax.request({
                url: '/masteringextjs/login',
                params: {
                    user: user,
                    password: pwd
                },
                success: function(conn, response, opts, eOpts) {
                    Ext.get(login.getEl()).unmask();
                    var result = Ext.JSON.decode(conn.responseText, true),
                    code = result.code,
                    message = result.message;
                    if (code == 200 ) {
                        console.log('login success')
                    } else {
                        Ext.Msg.show({
                            title:"Fail!",
                            msg: message,
                            icon: Ext.Msg.ERROR,
                            buttons: Ext.Msg.OK
                        })
                    }
                    
                },
                failure: function(conn, response, opts, eOpts) {
                    Ext.get(login.getEl()).unmask();
                    Ext.Msg.show({
                        title:"Error!",
                        msg: conn.responseText,
                        icon: Ext.Msg.ERROR,
                        buttons: Ext.Msg.OK
                    })
                }
            })
        }
    },
    onButtonClickCancel: function(button, e, options) {
        button.up('form').getForm().reset();
    },
    onTextfieldSpecialKey: function(field, e, options) {
        if (e.getKey() == e.ENTER) {
            var submitBtn = field.up('form').down('button#submit');
            submitBtn.fireEvent('click', submitBtn, e, options);
        }
    },
    onTextfieldKeyPress: function(field, e, options) {
        var charCode = e.getCharCode()
        
        if ((e.shiftKey && charCode >= 97 && charCode <= 122) || (!e.shiftKey && charCode >= 65 && charCode <= 90)) {
            if (this.getCapslockTooltip() == undefined) {
                Ext.widget('capslocktooltip');
            }
            this.getCapslockTooltip().show();
        } else {
            if (this.getCapslockTooltip() !== undefined) {
                this.getCapslockTooltip().hide();
            }
        }
    }
});