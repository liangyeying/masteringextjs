Ext.define('Packt.view.Login',{ // 类名
    extend: 'Ext.window.Window', // 继承的类
    alias: 'widget.login', // Login的别名
    autoShow: true,
    height: 250,
    width: 360,
    layout: {
        type: 'fit'
    },
    iconCls: 'x-fa fa-key',
    title: "Login",
    closeAction: 'hide',
    closable: false,
    items: [
        {
            xtype: 'form',
            frame: false,
            bodyPadding: 15,
            defaults: {
                xtype: 'textfield',
                anchor: '100%',
                labelWidth: 70,
                allowBlank : false,
                vtype: 'alphanum',
                minLength: 3,
                msgTarget: 'under'
            },
            items: [
                {
                    name: 'user',
                    fieldLabel: 'User',
                    maxLength: 15
                },
                {
                    inputType:'password',
                    name: 'password',
                    fieldLabel: 'Password',
                    maxLength: 15,
                    enableKeyEvents: true,
                    id: 'password'
                }
            ],
            dockedItems: [
                {
                    xtype: 'toolbar',
                    dock: 'bottom',
                    items: [
                        {
                            xtype: 'tbfill'
                        },
                        {
                            xtype: 'button',
                            itemId: 'cancel',
                            iconCls: 'x-fa fa-times',
                            text: "Cancel"
                        },
                        {
                            xtype: 'button',
                            itemId: 'submit',
                            formBind: true,
                            iconCls: 'x-fa fa-check',
                            text: "Submit"
                        }
                    ]
                }
            ]
        }
    ]
});