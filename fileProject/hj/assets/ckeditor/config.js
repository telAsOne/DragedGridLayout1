/**
 * @license Copyright (c) 2003-2016, CKSource - Frederico Knabben. All rights reserved.
 * For licensing, see LICENSE.md or http://ckeditor.com/license
 */

CKEDITOR.editorConfig = function( config ) {
	config.image_previewText = ' ';
	config.height = '392px'; // 高度  
	//改变大小的最小高度
	config.resize_minHeight = '392px';
	config.language = 'zh-cn';
	config.tabSpaces =0;
	config.undoStackSize =20;
	  config.extraPlugins="linkbutton" 
// 工具栏（基础'Basic'、全能'Full'、自定义）plugins/toolbar/plugin.js

    //config.toolbar = 'Basic';

    config.toolbar = 'Full';

    config.toolbar_Full = [
//Save
       ['Source','-','','NewPage','Preview','-','Templates'],
       ['Cut','Copy','Paste','PasteText','PasteFromWord','-','Print', 'SpellChecker', 'Scayt'],
       ['Undo','Redo','-','Find','Replace','-','SelectAll','RemoveFormat'],
       ['Form', 'Checkbox', 'Radio', 'TextField', 'Textarea', 'Select', 'Button', 'ImageButton', 'HiddenField'],
       '/',
       ['Bold','Italic','Underline','Strike','-','Subscript','Superscript'],
        ['NumberedList','BulletedList','-','Outdent','Indent','Blockquote'],
        ['JustifyLeft','JustifyCenter','JustifyRight','JustifyBlock'],
        ['Link','Unlink','Anchor'],
//        Image
        ['linkbutton','Flash','Table','HorizontalRule','Smiley','SpecialChar','PageBreak'],
       '/',
        ['Styles','Format','Font','FontSize'],
        ['TextColor','BGColor']
    ];
};
