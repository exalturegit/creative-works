package com.example.atm.ministatement

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity

data class MiniStatementEntity(
    @PrimaryKey
    var transaction_id: Long,

    @ColumnInfo(name = "ACCOUNT_NUMBER")
    var transactionAccountNumber: Long,

    @ColumnInfo(name = "TIME")
    var transactionTime: String,

    @ColumnInfo(name = "DATE")
    var transactionDate: String,

    @ColumnInfo(name = "REMARK")
    var remark: String,

    @ColumnInfo(name = "AMOUNT")
    var balance: Int


)

