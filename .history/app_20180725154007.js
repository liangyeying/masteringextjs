/*
 * This file is generated and updated by Sencha Cmd. You can edit this file as
 * needed for your application, but these edits will have to be merged by
 * Sencha Cmd when upgrading.
 */
Ext.application({
    name: 'Packt',

    extend: 'Packt.Application',

    requires: [
        'Packt.view.main.Main'
    ],

    // The name of the initial view to create. With the classic toolkit this class
    // will gain a "viewport" plugin if it does not extend Ext.Viewport. With the
    // modern toolkit, the main view will be added to the Viewport.
    //
    mainView: 'Packt.view.main.Main',
    
    launch: function() {
        console.log("test extjs")
    },
    init: function() {
        splashScreen = Ext.getBody().mask('Loading application', 'splashScreen');
        // splashScreen.addCls('splashscreen');
        // Ext.DomHelper.insertFirst(Ext.query('.x-mask-msg')[0], {
        //     cls: 'x-splash-icon'
        // })
    },
    splashScreen:{

    }
        
    //-------------------------------------------------------------------------
    // Most customizations should be made to Packt.Application. If you need to
    // customize this file, doing so below this section reduces the likelihood
    // of merge conflicts when upgrading to new versions of Sencha Cmd.
    //-------------------------------------------------------------------------
});