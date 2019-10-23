function edit_row(no)
{
 document.getElementById("edit_button"+no).style.display="none";
 document.getElementById("save_button"+no).style.display="block";
	
 var object=document.getElementById("object_row"+no);
 var parameter=document.getElementById("parameter_row"+no);
 var subparameter=document.getElementById("subparameter_row"+no);
	
 var object_data=object.innerHTML;
 var parameter_data=parameter.innerHTML;
 var subparameter_data=subparameter.innerHTML;
	
 object.innerHTML="<input type='text' id='object_text"+no+"' value='"+object_data+"'>";
 parameter.innerHTML="<input type='text' id='parameter_text"+no+"' value='"+parameter_data+"'>";
 subparameter.innerHTML="<input type='text' id='subparameter_text"+no+"' value='"+subparameter_data+"'>";
}

function save_row(no)
{
 var object_val=document.getElementById("object_text"+no).value;
 var parameter_val=document.getElementById("parameter_text"+no).value;
 var subparameter_val=document.getElementById("subparameter_text"+no).value;

 document.getElementById("object_row"+no).innerHTML=name_val;
 document.getElementById("parameter_row"+no).innerHTML=country_val;
 document.getElementById("subparameter_row"+no).innerHTML=age_val;

 document.getElementById("edit_button"+no).style.display="block";
 document.getElementById("save_button"+no).style.display="none";
}

function delete_row(no)
{
 document.getElementById("row"+no+"").outerHTML="";
}

function add_row()
{
 var new_object=document.getElementById("new_object").value;
 var new_parameter=document.getElementById("new_parameter").value;
 var new_subparameter=document.getElementById("new_subparameter").value;
	
 var table=document.getElementById("data_table");
 var table_len=(table.rows.length)-1;
 var row = table.insertRow(table_len).outerHTML="<tr id='row"+table_len+"'><td id='object_row"+table_len+"'>"+new_object+"</td><td id='parameter_row"+table_len+"'>"+new_parameter+"</td><td id='subparameter_row"+table_len+"'>"+new_subparameter+"</td><td><input type='button' id='edit_button"+table_len+"' value='Edit' class='edit' onclick='edit_row("+table_len+")'> <input type='button' id='save_button"+table_len+"' value='Save' class='save' onclick='save_row("+table_len+")'> <input type='button' value='Delete' class='delete' onclick='delete_row("+table_len+")'></td></tr>";

 document.getElementById("new_object").value="";
 document.getElementById("new_parameter").value="";
 document.getElementById("new_subparameter").value="";
}