package com.simon.dragoneclipse.card_service.model
import com.simon.dragoneclipse.card_service.model.mystling.Mystling
import jakarta.persistence.*

@Entity
data class Deck(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val name: String,

    @ManyToMany
    val cards: List<Card> = listOf(),

    @ManyToOne
    @JoinColumn(name = "mystling_deck")
    val mystling: Mystling
)
