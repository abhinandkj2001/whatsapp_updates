package com.example.internalexam.model

import com.example.internalexam.R

object SampleData {

    val statusDemo = listOf(
        StatusItemModel(R.drawable.lal, R.drawable.lal,"Lal"),
        StatusItemModel(R.drawable.gopi, R.drawable.gopi,"Gopi"),
        StatusItemModel(R.drawable.dileep, R.drawable.dileep,"Dileep"),
        StatusItemModel(R.drawable.jayaram, R.drawable.jayaram,"Jayaram"),
        StatusItemModel(R.drawable.ikka, R.drawable.ikka,"Ikka"),
        StatusItemModel(R.drawable.prithvi, R.drawable.prithvi,"Prithvi")

    )


    val findDemo = listOf(
        FindItemModel(R.drawable.laugh, R.drawable.gags,"Laugh Gags","12:23 AM","There's no sound, but there sure are plenty of laughs. This crazy Quebec-based troupe uses the city as its stage, and its inhabitants, or victims, as characters! People are caught in a twisted yet funny web of comedic deception. This updated \"Candid Camera\" is a tad more risque and a little kookier"),
//        FindItemModel(R.drawable.smriti,R.drawable.dhoni),
        FindItemModel(R.drawable.media, R.drawable.court,"Media One","12:23 AM","Electoral bonds: Disclose all details, Supreme Court tells SBI, asks bank not to be selective in disclosing data")

    )



    val channelDemo = listOf(
        ChannelItemModel(R.drawable.bbc,"BBC"),
        ChannelItemModel(R.drawable.facts,"FIND FACTS"),
        ChannelItemModel(R.drawable.sarcasm,"SARCASM")

    )
}