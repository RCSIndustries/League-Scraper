package com.code_catalyst.scraper

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


//@EnableScheduling
@EnableJpaRepositories()
@SpringBootApplication
class LeagueScraperApplication
 fun main(args: Array<String>) {
		runApplication<LeagueScraperApplication>(*args)
}
