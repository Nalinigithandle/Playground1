$(document).ready(function () {
    var id = 0;
    // Add button functionality
    $("table.dynatable button.add").click(function () {
        id++;
        var master = $(this).parents("table.dynatable");
        // Get a new row based on the prototype row
        var prot = master.find(".prototype").clone();
        prot.attr("class", "")
        prot.find(".id").attr("value", id);
        master.find("tbody").append(prot);
    });

    // Remove button functionality
    $("table.dynatable button.remove").live("click", function () {
        $(this).parents("tr").remove();

    });

    $("table.dynatable button.addColumn").click(function () {
        var columnName = window.prompt("Enter Column name", "");
        $('table').find('tr').each(function () {
            $(this).find('td').eq(0).after('<td></td>');
        });
    });
});