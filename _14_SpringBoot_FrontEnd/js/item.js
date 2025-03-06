const getAllCustomer=()=>{
  $.ajax({
    url: 'http://localhost:8080/api/v1/item/getAll',
    type: "GET",
    success:(res) =>{
      console.log(res)
      $('#item_table_body').empty()
      res.forEach(item => {
        $('#item_table_body').append(`
                 <tr>
                    <td>${item.id}</td>
                    <td>${item.name}</td>
                    <td>${item.description}</td>
                    <td>${item.qty}</td>
                    <td>${item.price}</td>

                     <td>
                          <button class="btn btn-update_item btn-sm" onclick="editItem('${customer.id}','${customer.name}','${customer.address}',${customer.age})">
                           Update
                           </button>
                      </td>
                       <td>
                            <button class="btn btn-delete btn-sm" onclick="deleteItem"('${customer.id}')">
                              Dalete
                             </button>
                        </td>
                     </tr>

          `)
      })

    },
    errors:(err) =>{
      console.log(err)
    }

  })
}
$(document).ready(function (){
  getAllCustomer();
})


$('#btn_save_customer').click((e) =>{
  e.preventDefault();
  const customerId=$("#id").val();
  const customerName=$('#name').val();
  const  customerAddress=$('#address').val();

  const customerData ={
    id:customerId,
    name: customerName,
    address: customerAddress,
  };

  $.ajax({
    url:'http://localhost:8080/api/v1/customer/save',
    type:"POST",
    data:JSON.stringify(
      customerData
    ),
    contentType:"application/json",
    success:(res) =>{
      getAllCustomer()
      console.log(res)
    },
    errors:(err) =>{
      console.log(err)
    }

  })
})

const deleteCustomer=(id) =>{
  $.ajax({
    url:`http://localhost:8080/api/v1/customer/delete/${id}`,
    type:'DELETE',
    success:(res)=>{
      console.log(res)
      getAllCustomer()

    },
    error:(err) =>{
      console.log(err)
    }

  })
}

const editCustomer=(id,name,address,age) =>{
  $('#updated_customer_id').val(id)
  $('#updated_name').val(name)
  $('#updated_address').val(address)
  $('#updateCustomerModal').modal('show')
}

$('#btn_update_customer').click((e) =>{
  e.preventDefault()
  const id=$('#updated_customer_id').val()
  const name=$('#updated_name').val()
  const address=$('#updated_address').val()

  const updateCustomerData={
    id,
    name,
    address,

  }
  $.ajax({
    url:'http://localhost:8080/api/v1/customer/update',
    type:'PUT',
    data: JSON.stringify(updateCustomerData),
    contentType:"application/json",
    success:(res)=>{
      getAllCustomer()
      console.log(res)
    },
    error:(res)=>{
      console.log(err)
    }


  })
})
