specialKeys=function (event) {
//    var $=function (id){document.getElementById(id)}
    var keyCode = event.keyCode || event.which;
    if ((event.ctrlKey || event.metaKey|| event.shiftKey) && keyCode == 13) {
//        alert("GO")
        document.getElementById('form').submit();
    }
    if (keyCode == 9) {
//        alert("tab")
        event.preventDefault();
        event.Handled=true;
        var editor = $(this);
        var start = editor.get(0).selectionStart;
        var end = editor.get(0).selectionEnd;

        // set textarea value to: text before caret + tab + text after caret
        var left=editor.val().substring(0, start);
        var right=editor.val().substring(end);
        this.val(left+ "\t"+ right);

        // put caret at right position again
        editor.get(0).selectionStart =
        editor.get(0).selectionEnd = start + 1;
        return false
    }

};

//$(document).ready(function() {
window.onload =(function() {
//    document.getElementById('text').keydown(specialKeys);
});
