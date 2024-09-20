package com.code_catalyst.scraper.constants

import java.io.File

class Constants {
    companion object {

        private fun importAgents(): ArrayList<String> {
            val agents: ArrayList<String> = ArrayList<String>();
            File("src/main/resources/agents.txt").forEachLine {
                agents.add(it);
            }
            return agents;
        }

        val userAgents: ArrayList<String> =importAgents();

    }
}