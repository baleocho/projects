<?php
class SuperHero {
    // Promote properties to public PHP8
    public function __construct(
        readonly public string $name, // Cannot be changed after instantiation
        public string $planet, 
        public array $powers,
        private string $weakness = "Kryptonite" // Cannot be called outside the class
    ) {

    }

    public function attack() {
        $powers = implode(", ", $this->powers);
        return "$this->name came from: $this->planet and attacks with $powers";
    }

    public function get_weakness() {
        return $this->weakness;
    }

    public function show_all(){
        return get_object_vars($this);
    }

    public static function get_random_hero(){
        $names = ["Batman", "Superman"];
        $planets = ["Earth", "Mars", "Venus"];
        $powers = [
            ["Super speed", "Super strength", "Invisibility"],
            ["Super speed", "Super strength", "Invisibility", "Telepathy"]
        ];

        $random_name = $names[array_rand($names)];
        $random_planet = $planets[array_rand($planets)];
        $random_powers = $powers[array_rand($powers)];
        return new self($random_name, $random_planet, $random_powers);
    }
}

$hero = new SuperHero("Superman", "Krypton", ["Super speed", "Super strength"]);
echo $hero->name;
echo PHP_EOL;
echo $hero->attack();
echo PHP_EOL;
//echo $hero->weakness; // Error: Cannot access private property SuperHero::$weakness
echo  $hero->get_weakness(); // Accessing private property through a public method
echo PHP_EOL;
echo var_dump($hero->show_all()); // Accessing all properties of the object
echo PHP_EOL;
$randomHeroObjt = SuperHero::get_random_hero(); // Accessing static method
echo "Random hero name: $randomHeroObjt->name";
?>