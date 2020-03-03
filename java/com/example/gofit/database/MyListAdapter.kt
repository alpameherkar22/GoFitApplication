package com.example.gofit.database

import android.content.Context
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.gofit.R

class MyListAdapter (var mCtx:Context,var resource:Int,var items:List<User>)
    :ArrayAdapter<User>(mCtx,resource,items){

    internal var helper = DatabaseHelper(mCtx)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater: LayoutInflater= LayoutInflater.from(mCtx)
        val view: View =layoutInflater.inflate(resource,null)


        val emailname:TextView=view.findViewById(R.id.emailname)
        val passname:TextView=view.findViewById(R.id.passname)



        val delete:Button=view.findViewById(R.id.delete)

        val user: User =items[position]


        emailname.text=user.email
        passname.text=user.password





        delete.setOnClickListener {
            delete(user)
            Toast.makeText(mCtx,"User deleted",Toast.LENGTH_LONG).show()
            Handler().postDelayed({
                Toast.makeText(mCtx,"Click on Refresh",Toast.LENGTH_LONG).show()
            },1100)
        }

        return view
    }


 fun delete(user: User){
     helper.deleteData(user.id)

    }

}