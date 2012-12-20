specialKeys=function (event) {
    if ((event.ctrlKey || event.metaKey) && event.keyCode == 13) {
//        alert("GO")
        $('#form').submit();
        $('#new_script').submit();
    }
    var keyCode = event.keyCode || event.which;
    if (keyCode == 9) {
//        alert("tab")
        event.preventDefault();
        event.Handled=true
        var start = $(this).get(0).selectionStart;
        var end = $(this).get(0).selectionEnd;

        // set textarea value to: text before caret + tab + text after caret
        var left=$(this).val().substring(0, start)
        var right=$(this).val().substring(end)
        $(this).val(left+ "\t"+ right);

        // put caret at right position again
        $(this).get(0).selectionStart =
        $(this).get(0).selectionEnd = start + 1;
        return false
    }

};

ok=false
$(document).ready(function() {
    if(ok)return;
    ok=true
    $('textarea').keydown(specialKeys);
});
