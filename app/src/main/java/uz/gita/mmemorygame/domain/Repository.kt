package uz.gita.mmemorygame.domain

import uz.gita.mmemorygame.R
import uz.gita.mmemorygame.data.enums.CategoryEnum
import uz.gita.mmemorygame.data.enums.DifficultyEnum
import uz.gita.mmemorygame.data.models.CardData

class Repository private constructor() {

    companion object {
        private lateinit var instance: Repository

        fun init() {
            instance = Repository()
        }

        fun getInstance() = instance
    }

    private val list = ArrayList<CardData>()
    private val colors: ArrayList<Int> = arrayListOf(
        R.color.first,
        R.color.second,
        R.color.third,
        R.color.fourth,
        R.color.fifth,
        R.color.sixth,
        R.color.seventh,
        R.color.eigthth,
        R.color.nineth
    )


    init {
        list.add(CardData(1, R.drawable.ic_bear, colors[(0..8).random()],CategoryEnum.Animals.categoryName, "Sun bears are named for the golden patches of fur on their chests, which some people say resemble a rising sun. While their tongues may be extra-big, sun bears are actually the smallest bear species. Males grow about 5 feet long and weigh up to 150 pounds—that’s about half the size of an adult American black bear.\n" +
                "\n" +
                "These animals live in wooded areas of Southeast Asia. Strong and agile, sun bears are good at climbing trees. They spend a lot of time in tree canopies and even build \"beds\" of twigs and leaves on the branches to sleep in.\n" +
                "\n" +
                "Sun bears chow down insects, leaves, lizards, and berries. But the sun bear’s favorite snack is honey. To get the treat, they rip open beehives with their sharp claws. Then the bears use their superlong tongues to extract the honey inside, often gobbling up bees with the sticky sweet. Thick fur and skin protect the bear from the angry bees. That’s nothing to stick your tongue out at."))
        list.add(CardData(2,R.drawable.ic_deer,colors[(0..8).random()],CategoryEnum.Animals.categoryName, "Deers’ eyes are on the side of the head.\n" +
                "\n" +
                "Deer walk in groups called herds, they are social animals. \n" +
                "\n" +
                "Deers are elusive prey and difficult to spot from dense cover like forests or woodlands where they would otherwise conceal themselves from danger.\n" +
                "\n" +
                "Deer can run over 35 miles per hour, making them one of the fastest animals in the world!\n" +
                "\n" +
                "When a deer is happy, it may \"dance.\"  This is also called pronking. The deer will leap high into the air and then do a little shake now and then.\n" +
                "\n" +
                "Deer are often referred to as the four-legged animal without fear because of their curious and cheerful nature.\n" +
                "\n" +
                "Some species of the deer have been recorded on film eating infant birds, this is uncanny as deer are primarily herbivores.\n" +
                "\n" +
                "The tissues present in the antlers of a deer grow faster than any other tissue on the planet.\n" +
                "\n" +
                "Chinese water deer do not possess an antler. They are the only deer species that do not have antlers, they use a very long canine tooth that they show off to impress their female mates.\n" +
                "\n" +
                "Some trees have a defensive mechanism where they produce an excess amount of acid to become bitter and make the deer lose interest in consuming them, they can identify deer saliva."))
        list.add(CardData(3,R.drawable.ic_elephant,colors[(0..8).random()],CategoryEnum.Animals.categoryName,"When an elephant drinks, it sucks as much as 2 gallons (7.5 liters) of water into its trunk at a time. Then it curls its trunk under, sticks the tip of its trunk into its mouth, and blows. Out comes the water, right down the elephant's throat.\n" +
                "\n" +
                "Since African elephants live where the sun is usually blazing hot, they use their trunks to help them keep cool. First they squirt a trunkful of cool water over their bodies. Then they often follow that with a sprinkling of dust to create a protective layer of dirt on their skin. Elephants pick up and spray dust the same way they do water—with their trunks.\n" +
                "\n" +
                "Elephants also use their trunks as snorkels when they wade in deep water. An elephant's trunk is controlled by many muscles. Two fingerlike parts on the tip of the trunk allow the elephant to perform delicate maneuvers such as picking a berry from the ground or plucking a single leaf off a tree. Elephants can also use its trunk to grasp an entire tree branch and pull it down to its mouth and to yank up clumps of grasses and shove the greenery into their mouths."))
        list.add(CardData(4,R.drawable.ic_fox,colors[(0..8).random()],CategoryEnum.Animals.categoryName,"The sun starts to set in northern Virginia, and a red fox wakes up and stretches, ready to search for dinner. She hunts alone and steps silently through the bushes. In the shadows she’s almost invisible. Then she stops; she smells something. The red fox suddenly leaps up, over the edge of … an open garbage can. She tears through a plastic bag and snatches some scraps of grilled chicken. As the fox climbs out, the garbage can tips over with a crash. Bang! A dog barks. Backyard lights turn on, but the sly fox has already disappeared through the fence with her meal in her mouth.\n" +
                "\n" +
                "The dinnertime scenario is common across much of the northern hemisphere, the red fox’s natural range. (Red foxes are the most widespread meat-eating mammals on the planet.) Cities and suburbs are spreading into the countryside, swallowing up red fox habitats across the world. But instead of moving, these clever wild animals learn to thrive near large populations of people.\n" +
                "\n" +
                "To avoid humans, skillful red foxes hunt at night in backyards, gardens, and city parks. Luckily, they’re not picky eaters. Although rabbits, mice, and other rodents are their favorite meals, red foxes will eat birds, frogs, snakes, grasshoppers, and even berries. An extra-hungry red fox will also jump into an open garbage can for tasty leftovers or nibble on food that’s been left out on the porch for someone’s pet."))
        list.add(CardData(5,R.drawable.ic_giraffe,colors[(0..8).random()],CategoryEnum.Animals.categoryName,"Giraffes grow about 4 feet (1.2 meters) in their first year of life. A newborn giraffe is about 6 feet (1.9 meters) tall at birth and weighs about 150 pounds (68 kilograms).\n" +
                "Many young giraffes, called calves, die from lion attacks during their first year of life. Once a giraffe reaches adulthood its height is often enough to protect it from lions. Adult giraffes, however, must still be careful of lions when they are bending down to drink water or rest. Usually giraffes will drink or rest in shifts so that at least one giraffe is always on the lookout for approaching predators.\u200B\n" +
                "\u200BThe giraffes' height and excellent vision give them a wide view of the grasslands where they live, making it easy to spot predators from a distance. Some scientists believe that other animals—such as zebras, antelope, and wildebeests—often congregate near giraffes to take advantage of their ability to see danger from a distance. The giraffe could be considered the early warning system of the African grasslands."))
        list.add(CardData(6,R.drawable.ic_lion,colors[(0..8).random()],CategoryEnum.Animals.categoryName,"The lion has a long body, short legs, sharp claws, and a large head. Adult males are about 9 to 10 feet (2.7 to 3 meters) long, including the tail. They stand about 3 feet (1 meter) tall at the shoulder and can weigh 370 to 500 pounds (170 to 230 kilograms). Females are shorter and more slender.\n" +
                "\n" +
                "Lions are covered with yellow-brown hair. A male lion is easy to spot because of its mane. This coarse hair grows on its head, neck, and shoulders. Lionesses (females) do not have manes."))
        list.add(CardData(7,R.drawable.ic_monkey,colors[(0..8).random()],CategoryEnum.Animals.categoryName,"Howler monkeys are the loudest of all monkeys. They call to let others know where their territory is, alerting them to stay away. The calls sound like a loud whooping bark or roar. After one group of howlers call, another group answers. Howler monkeys usually do this in the morning and at the end of the day.\n" +
                "\n" +
                "These monkeys live in Central and South America. At home in the forest, they hardly ever leave the treetops. They don't move very far each day, feeding leisurely at the very top of the forest canopy. Howlers mainly eat leaves, as well as fruits, nuts, and flowers. Howler monkeys get almost all the water they need from the food they eat. One of the few times they can be spotted on the ground, however, is during very dry spells when they need to find extra water\n" +
                "\n" +
                "Howler monkeys have prehensile tails, or tails that can grip. The monkeys use their tails as a fifth limb to grip branches. Mostly it uses its tail to help grip branches as it eats and moves around high in the trees. Each family group is generally made up of 15 to 20 howlers. The leader is usually an old male. The head and body of adult howler monkeys range from 22 to 36 inches (55.8 to 91.4 centimeters) long and their tail can add 23 to 36 inches (58.4 to 91.4 centimeters).\n" +
                "\n" +
                "Though most species are classified as least concern, the Yucatán Black is endangered."))
        list.add(CardData(8,R.drawable.ic_panda,colors[(0..8).random()],CategoryEnum.Animals.categoryName,"The giant panda is found only in bamboo forests in central China. The giant panda has a bulky body and a round head. Its fur is white with black on the shoulders, legs, and ears and around the eyes. Males grow to about 5 feet (1.5 meters) tall and weigh about 220 pounds (100 kilograms). Females are usually smaller.\n" +
                "\n" +
                "Giant pandas usually live alone. They spend most of their time on the ground, but they can also climb trees. They eat mostly bamboo. Wild pandas spend up to 16 hours each day eating up to 40 pounds (18 kilograms) of bamboo. In zoos they also eat grains, fruits, and vegetables."))
        list.add(CardData(9,R.drawable.ic_pinguin,colors[(0..8).random()],CategoryEnum.Animals.categoryName,"These flightless birds breed in the winter. After a courtship of several weeks, a female emperor penguin lays one single egg then leaves! Each penguin egg's father balances it on his feet and covers it with his brood pouch, a very warm layer of feathered skin designed to keep the egg cozy. There the males stand, for about 65 days, through icy temperatures, cruel winds, and blinding storms.\n" +
                "\n" +
                "Finally, after about two months, the females return from the sea, bringing food they regurgitate, or bring up, to feed the now hatched chicks. The males eagerly leave for their own fishing session at sea, and the mothers take over care of the chicks for a while.\n" +
                "\n" +
                "As the young penguins grow, adults leave them in groups of chicks called crèches while they leave to fish. There is a reason for the timing of emperor penguins' hatching. By December, when the Antarctic weather has warmed somewhat, the ice the penguins occupy begins to break up, bringing open waters closer to the nesting sites. Now the chicks are old enough to take to the seas and fish for their own food."))
        list.add(CardData(10,R.drawable.ic_rabbit,colors[(0..8).random()],CategoryEnum.Animals.categoryName,"The sun sets over a quiet backyard garden. A red fox sneaks into the yard, its nose in the air, sniffing loudly—it smells something. It pads over to the bushes when a streak of brown flashes in the greenery. An eastern cottontail rabbit darts out of the bushes, zigging and zagging to throw the surprised fox off of its trail. The speedy rabbit zooms into the nearby woods, easily escaping the potential predator.\n" +
                "\n" +
                "Eastern cottontail rabbits—named for their short, cotton-ball-like tails—are the most common species of cottontail rabbits. They can be found from Canada to South America; in the United States, their range stretches from the East Coast to the Midwest.\n" +
                "\n" +
                "These rabbits often live on the edges of fields, farms, and other open spaces far from highly populated areas. But sometimes they make their nests in yards and parks near more people.\n" +
                "\n" +
                "Eastern cottontails stay mostly hidden during the day but come out at night to eat. They snack on grass and love garden greens like peas and lettuce. (That’s why farmers and gardeners don’t like them very much!) During the winter, these rabbits prefer to eat bark and twigs."))
        list.add(CardData(11,R.drawable.ic_squirrel,colors[(0..8).random()],CategoryEnum.Animals.categoryName,"There are more than 200 species of squirrels living all around the world, including kinds of tree, ground, and flying squirrels. You may have seen the eastern gray squirrel in parks, your backyard, or in a forest in the eastern half of the United States.\n" +
                "\n" +
                "Eastern gray squirrels forage for nuts, seeds, buds, and flowers of trees. Like other tree squirrels, the eastern gray squirrel plays an important role in what’s known as seed dispersal. As winter approaches, squirrels carry their food and bury it in several locations, but they sometimes forget exactly where. That helps the environment because these buried seeds and nuts sprout and grow the following spring.\n" +
                "\n" +
                "Eastern gray squirrels have an excellent sense of smell, which they use to help locate food that they’ve hidden away. They can also pick up information about their fellow squirrels by smelling them.\n" +
                "\n" +
                "They communicate with each other by making sounds and body movements, such as tail flicking. When predators such as red foxes and red-tailed hawks are nearby, eastern gray squirrels will sound warning calls to alert other squirrels.\n"))
        list.add(CardData(12,R.drawable.ic_tiger,colors[(0..8).random()],CategoryEnum.Animals.categoryName,"A tiger is a type of large cat that is found in Asia and southern Russia.\n" +
                "\n" +
                "The scientific name for a tiger is Panthera tigris.\n" +
                "\n" +
                "Tigers are the largest of the world's big cats. Male tigers can weigh up to 300 kilograms and measure nearly 13 feet (4 m) in length. Females are smaller, weighing a maximum of 170 kilograms and measuring between 6 and 9 feet (2.74 m) in length.\n" +
                "\n" +
                "They are excellent hunters and are considered to be an apex predator. They rely on sight and sound for hunting, rather than smell like other animals.\n" +
                "\n" +
                "Tigers have incredibly distinctive fur. Most types of tigers have orange and black stripes all over their body, whereas some types have a black and white colour variation. This pattern helps tigers to remain camouflaged as they stalk their prey."))
        list.add(CardData(13,R.drawable.ic_wolf,colors[(0..8).random()],CategoryEnum.Animals.categoryName,"Wolves work together to hunt, raise their young, and protect their territory. Wolves communicate with more than howls. They whimper and whine, growl and bark, yelp and snarl. They also use scents produced by their bodies to communicate. A wolf’s sense of smell is 100 times stronger than a human’s. One source of scent is urine, which they use to mark territory and to tell other wolves in their own pack where they are. Another way wolves communicate is through body language. If a wolf feels confident, it will approach another wolf with its head and tail held high and ears perked up. If you saw a wolf slinking toward another with its body lowered, its tail between its legs, and its ears flattened, you'd know it was approaching a dominant animal.\n" +
                "\n" +
                "\n" +
                "When a pack of wolves does howl, it can be heard from ten miles away. The howl is used as a way to call to another pack or warn of danger. Each pack has a unique howl, and while they don’t howl at the moon, wolves howl more when the moon is full and bright.\n" +
                "\n" +
                "When a wolf wants to play, it prances about happily and bows—lowering the front of its body while its rump stays up in the air with its tail wagging. When its angry, a wolf may furrow its forehead, show its fangs, or growl. A wolf's body language may remind you of another animal: a pet dog. Wolves and dogs are closely related, and the ways they communicate are similar."))
        list.add(
            CardData(
                14,
                R.drawable.ic_zebra,
                colors[(0..8).random()],
                CategoryEnum.Animals.categoryName,
                "Zebras stick together in herds. Within a herd, zebras tend to stay together in smaller family groups. Families are generally made up of a male, several females, and their young.\n" +
                        "\n" +
                        "As a zebra grazes, it uses its sharper front teeth to bite the grass, and then uses its duller back teeth to crush and grind. A zebra's teeth keep growing for its entire life, because constant grazing and chewing wears them down.\n" +
                        "\n" +
                        "Zebras are constantly on the move to find fresh grass and water. Sometimes they gather in huge herds of thousands as they migrate to better feeding grounds. They often travel in mixed herds with other grazers and browsers, such as wildebeest."
            )

        )

        list.add( CardData(15, R.drawable.ic_brookly, colors[(0..8).random()],CategoryEnum.Vegetables.categoryName, "Broccoli’s popularity is fueled by the fact it is a nutritional superstar. An excellent source of vitamins C and K, it’s also a good source of folate and Vitamin A, as well as healthful antioxidants and phytochemicals. Plus it’s a delicious and versatile veggie that can be enjoyed raw, steamed, roasted, and in everything from soup to salad to, yes, even smoothies!\n" +
                "\n" +
                "Varieties: Broccoli is a cool season crop that thrives when day temperatures are in the 60s F. Choose varieties bred for better heat tolerance if your mild spring weather transitions to hot summer temperatures before the harvest is ready. Choose varieties bred for cold tolerance for fall and (in mild climates) winter harvests. Heading broccoli varieties, that form large central heads, are the most familiar. Sprouting broccoli varieties form many smaller, looser flower heads rather than one solid, central one.\n" +
                "\n" +
                "Site: Full sun and fertile, well-drained soil. Broccoli does best in soil with a pH of 6.0-7.2. Growing in raised beds is a good option if your site is not well drained."))
        list.add( CardData(16, R.drawable.ic_cabbage, colors[(0..8).random()],CategoryEnum.Vegetables.categoryName, "Cabbage is a vegetable that does not get the attention it deserves in the United States. Other than using it as the basis for creamy coleslaw or, if you’re ambitious, making homemade sauerkraut, cabbage is rarely the star of an American meal. This is unfortunate, because cabbage has so many wonderful qualities it deserves the royal treatment in the kitchen.\n" +
                "\n" +
                "It’s affordable. It’s often one of the least expensive vegetables at the market.\n" +
                "\n" +
                "It’s versatile. It can be eaten raw, pickled, steamed, sautéed, roasted, and added to stir-fries and soups. Steamed leaves can be wrapped around vegetables and meats.\n" +
                "\n" +
                "It’s super-nutritious. It’s an excellent source of vitamins C and K, as well as dietary fiber and contains Vitamins B1 and B6, manganese, potassium, and many other nutrients.\n" +
                "\n" +
                "It’s good for your health in other ways. Phytonutrients and sulfur-containing compounds are two of the substances in cabbage that are believed responsible in reducing risk of cancer, improving nervous system health, and aiding digestion, among other health benefits.\n" +
                "\n" +
                "It’s also easy to grow and stores well."))
        list.add( CardData(17, R.drawable.ic_carrot, colors[(0..8).random()],CategoryEnum.Vegetables.categoryName, "Whether you are a novice gardener or veteran with many seasons of experience, carrots are one of the most rewarding crops you can grow. Pulling the sweet tasting, brightly colored roots out of the ground is like unearthing buried treasure – a thrill no matter how many times it’s repeated. Fortunately, these nutritious veggies are usually easy to grow in most parts of the country. So put an X on your garden map to mark the spot where you’ll be unearthing garden gold at harvest time.\n" +
                "\n" +
                "Varieties: Carrot varieties can be grouped into categories several ways -- based on their size and shape; when they ripen; and color. Also look for disease and crack resistant varieties.\n" +
                "\n" +
                "Size and shape:\n" +
                "Long and tapered. Imperator types, the long, thin, tapered carrots you find in most supermarkets, have been bred for commercial production and mechanical harvesting. A better choice for most home gardeners are the sweet, crisp Nantes types, that are a little shorter (5-7 inches long) and a little stockier. These types do best in deep, relatively light, stone-free soil.\n" +
                "Medium and blunt. Chantenay and Danvers types are 4-6 inches long, with a chunky, blunt-tipped profile. These crisp, sweet carrots are a good choice for heavy soils.\n" +
                "Short and round. In stony or heavy soil, long carrots often develop forked roots. Choose short, stocky or round varieties such as 'Thumbelina', Paris Market’ or 'Little Finger' instead.\n" +
                "Maturity Date: Choose early, short-season varieties for late spring and summer eating. Main season varieties are a good choice for fall harvest and storage."))
        list.add( CardData(18, R.drawable.ic_corn, colors[(0..8).random()],CategoryEnum.Vegetables.categoryName, "The corn we know today could never survive in the wild; it relies on humans to plant it. That’s because the kernels (seeds) adhere firmly to the cob, rather than loosening and scattering on their own. It takes some strong hands — or a machine — to loosen the kernels! However, it wasn’t always that way.\n" +
                "\n" +
                "Like so many of our other favorite fruits and vegetables, the sweet corn we enjoy at picnics is very different from its wild ancestor. The domestication of corn began in Mexico and Central America thousands of years ago, from a wild grain called teosinte. Wild teosinte had small ears with just five to 10 small, widely spaced kernels. When Aztec and Mayan Indians began growing the crop and selecting which teosinte kernels to plant, they likely saved seeds from plants that grew better, had larger cobs, and had kernels that were tastier or easier to grind into meal.\n" +
                "\n" +
                "Most grains have seed heads that shatter, scattering the seeds around the mother plant, effectively planting seeds for the next generation. Corn seed heads (cobs), on the other hand, hold on tightly to their kernels. Did the farmers also select for that trait? We don’t know. But we do know that when you sow corn seeds, you’re doing what this plant can’t do on its own!"))
        list.add( CardData(19, R.drawable.ic_cucumber, colors[(0..8).random()],CategoryEnum.Vegetables.categoryName, "Grow cucumbers in your home or school garden and you’ll become part of a long gardening heritage. These crisp, refreshing vegetables originated in India, where they have been grown for the past 3000 years! Of course, many changes have come to this crop over the centuries, so gardeners can find a cucumber variety that works in just about any garden situation.\n" +
                "\n" +
                "There's a type of cucumber for every use, including slicers for fresh eating, and varieties bred especially for pickle making. You can, however, pickle any small cucumber, or eat picklers fresh right off the vine, so experiment with different varieties, regardless of how you intend to use them. Slicers generally form 5- to 9-inch long, cylindrical cucumbers with tender, dark green skins and bear over a period of 4-6 weeks. Pickling varieties produce smaller fruits on fast-growing vines and generally produce most of their crop in the space of a couple of weeks. This concentrated bearing makes it convenient to harvest plenty for a pickling session. "))
        list.add( CardData(20, R.drawable.ic_eggplant, colors[(0..8).random()],CategoryEnum.Vegetables.categoryName, "Eggplant, with its shiny purple skin and globe shape, might just be the most mysterious of vegetables. It’s related to several common garden crops, and it’s easy to grow; yet, it’s much less commonly grown and eaten than other crops.\n" +
                "\n" +
                "Eggplants originated in India, where it is known as “The King of Vegetables.” In many parts of the world, it is called aubergine from the ancient Indian language Sanskrit.\n" +
                "The name eggplant came from a small, white, oval variety popular among the English during the Victorian period.\n" +
                "Eggplants are related to tomatoes and potatoes. They belong to the deadly nightshade family and they’re considered fruit, not vegetables.\n" +
                "Ancient people thought eggplants were poisonous and might cause pimples, epilepsy, or even death.\n" +
                "\n" +
                "Eggplant contains a lot of water. Sprinkle it with salt and let it set for 20 minutes to release the water. Blot the eggplant with a paper towel.\n" +
                "Eggplant can be fried, sautéed, grilled, or baked. It has a mild flavor and a meaty texture. It’s best used with flavorful sauces and seasonings."))
        list.add( CardData(21, R.drawable.ic_garlic, colors[(0..8).random()],CategoryEnum.Vegetables.categoryName, "Garlic is in the onion family. It grows wild in many places.\n" +
                "Garlic is available in many forms – fresh, dried, and as a paste or a powder.\n" +
                "This pungent vegetable is enclosed in a paper-like coating. Remove this coating to get to the garlic cloves.\n" +
                "Garlic was traditionally hung by its greens to dry.\n" +
                "Garlic has a long tradition of being used as a medicine. In ancient Egypt, it was given to workers to make them stronger. The Romans thought it could strengthen the heart, get rid of parasites, and treat the skin. During the Middle Ages, it was used (ineffectively) to ward off the plague. American colonists thought it could treat tapeworms and cure flu symptoms. During World War I, it was used to treat wounds.\n" +
                "Chemical compounds in garlic give it its strong odor. Keep a toothbrush handy after you eat it.\n" +
                "Garlic’s flavor and odor mellows when it’s roasted or sautéed in butter.\n" +
                "Garlic is used in many international foods, such as Thai, Chinese, Italian, and Mexican."))
        list.add( CardData(22, R.drawable.ic_mushroom, colors[(0..8).random()],CategoryEnum.Vegetables.categoryName, "Mushrooms are fungi and grow differently than fruits and vegetables. Mushrooms begin life as fungal spores. When spores germinate, they grow into a lacy, filament-like root network called mycelium. Have you ever seen a mushroom grow in the wild? What you cannot see is the underground network of mycelium that scavenges the soil for food. Mushrooms are decomposers and break down dead plants to recycle their nutrients. When mycelium is mature, it produces a mushroom which will spread its spores in the forest to continue the lifecycle of the mushroom. Mushroom farmers start from fungal spores to grow and harvest delicious mushrooms.\n" +
                "\n" +
                "Mushrooms flourish under precise conditions. Mushroom farms are typically indoors so farmers can replicate nature’s perfect conditions. Each variety of mushrooms prefers a certain amount of heat, humidity, and air flow. Mushrooms grown for human consumption are grown in a very sterile environment to prevent any contamination. Pro-tip: mushrooms need good air flow, so never store them in a plastic bag (instead, store in their original packaging, or a clean brown paper bag).\n" +
                "\n" +
                "Mushrooms can thrive without any light. Unlike green plants that convert sunlight to food through photosynthesis, the mushrooms gather nourishment from their growing medium, called compost. Mushroom farmers use a variety of growing mediums such as straw, corn cobs, cocoa hulls, or oats. \n" +
                "\n" +
                "When some mushrooms are exposed to ultraviolet light such as from sunlight or an ultraviolet lamp, they produce a nutritionally significant amount of Vitamin D2. White mushrooms, crimini or brown mushrooms, portabella mushrooms, and maitake mushrooms are excellent producers of Vitamin D2 when exposed to ultraviolet light. Mushrooms that have been exposed to UV light are the only source of Vitamin D on the produce aisle! Ask your produce buyer if they source mushrooms enriched with Vitamin D.\n" +
                "\n"))
        list.add( CardData(23, R.drawable.ic_onion, colors[(0..8).random()],CategoryEnum.Vegetables.categoryName, "The onion is a plant bulb made up of crisp, fleshy layers. Valued for its flavor, it may be cooked or eaten raw. The onion is an herb that belongs to the lily family. It is related to garlic, leeks, and chives. Its scientific name is Allium cepa.\n" +
                "\n" +
                "Onions are grown in mild climates around the world. Major onion producers include China, India, the United States, and Turkey.\n" +
                "\n" +
                "Onions grow on plants with long, hollow leaves that look like stalks. The bulb forms at the bottom of the stalks, just under the soil. Onion bulbs vary in size, shape, color, and flavor. They range from less than 1 inch (2.5 centimeters) to more than 4.5 inches (11 centimeters) across. They are typically round or a little flattened. They may be white, yellow, or red.\n" +
                "\n" +
                "Onions contain an oil that is rich in the mineral sulfur. This oil is released into the air when an onion is cut. The oil mixes with the fluid in a person’s eyes, making the eyes tear.\n" +
                "\n" +
                "In addition to their use in cooking, onions have been used in medicine. Some people think that onions can treat everything from colds and earaches to animal bites and warts."))
        list.add( CardData(24, R.drawable.ic_pea, colors[(0..8).random()],CategoryEnum.Vegetables.categoryName, "Even kids who don’t like vegetables usually like peas. Peas grow on long vines. They have white flowers and they make beautiful garden plants.\n" +
                "\n" +
                "English peas are harvested when they’re young and tender. They’re removed from their pods and usually sold frozen or canned.\n" +
                "Snap peas and snow peas make a great snack. The entire sweet, crunchy pod is edible.\n" +
                "Field peas are harvested when they’re more mature and dried. They are used to make pea soup. In Medieval times, pease porridge was a diet staple.\n" +
                "Researchers believe peas were growing in Greece, Syria, Turkey, and Jordan at least 4,000 years ago.\n" +
                "Peas are most commonly green. They can also be yellow or purple.\n" +
                "Peas are cool-weather crops. They wither and die in the heat but grow well in the spring and fall.\n" +
                "Thomas Jefferson grew more than 30 varieties of peas on his plantation.\n" +
                "These sweet vegetables are high in fiber, protein, vitamin B, and vitamin C"))
        list.add( CardData(25, R.drawable.ic_peper, colors[(0..8).random()],CategoryEnum.Vegetables.categoryName, "They are eaten as vegetables and used to flavor foods. Garden peppers come from plants of the nightshade family, which also includes tomatoes, potatoes, and eggplant. The spice called black pepper comes from an unrelated plant.\n" +
                "\n" +
                "Peppers are grown widely in the tropical parts of Asia and Central and South America. The first Europeans to visit the Americas carried pepper seeds back to Spain in 1493. From there the plants spread quickly throughout Europe.\n" +
                "\n" +
                "Pepper plants reach 2 to 4 feet (0.6 to 1.2 meters) in height. The fruits differ in size, shape, and taste. When ripe, peppers range in color from yellow to deep red and purple.\n" +
                "\n" +
                "Peppers can be mild or hot. Mild peppers are usually large. Bell, or sweet, peppers are mild peppers that are bell-shaped, wrinkled, and puffy. They are often used in salads and in cooked dishes. Bell peppers are rich in vitamins A and C. Paprika is a mild pepper that is usually made into a powder and used as a spice.\n" +
                "\n" +
                "Hot peppers include tabasco, chili, and cayenne peppers. These peppers contain a substance called capsaicin, which gives them a strong, burning taste. Hot peppers are generally used as relishes or are ground into a fine powder for use as spices. Tabasco peppers are ground and mixed with vinegar to make a popular hot sauce."))
        list.add( CardData(26, R.drawable.ic_radish, colors[(0..8).random()],CategoryEnum.Vegetables.categoryName, "What comes to mind when you hear the word \"radish?\" Cherry-red, ping pong-sized spheres that add spicy-hot crunch to salads? Or are cleverly carved into \"radish rose\" garnishes? These may be the most popular uses, but radishes can offer so much more! Depending on the variety, they can also be sautéed, roasted, grilled, and stir-fried; diced into soups and stews; or pickled and fermented into delicacies like Korean kimchi.\n" +
                "\n" +
                "There are dozens of types of radishes in a variety of shapes, colors, and flavors: Round to tapered. Thumb-sized to foot-long. With skin in shades of red, pink, black, white, and green. Some have colorful flesh, too. All have some degree of spiciness or heat — from pleasingly piquant French breakfast radishes to pungent and peppery Spanish radishes.\n" +
                "\n" +
                "Radishes are in the brassica (mustard or cabbage) family and are related to broccoli, cauliflower, and kale.\n" +
                "The scientific name is Raphanus sativus. The genus name Raphanus is Greek for \"quickly appearing.\" The species name sativus is a botanical term derived from Latin that is often used for plants that promote good health.\n" +
                "The species is thought to have originated in Southeast Asia, though no one knows for sure. They were domesticated in Europe in pre-Roman times and are now grown worldwide.\n" +
                "Radishes are a good source of vitamin C and contain folate, fiber, riboflavin and potassium, as well as copper, vitamin B6, magnesium, manganese, and calcium.\n" +
                "The skin of a radish contains much of the spiciness, so if you prefer a mellower flavor, peel it first.\n" +
                "Radish greens are edible, too. Pluck a few young, tender greens to add to sandwiches and salads. Older greens can be sautéed or steamed. Don't overdo it, though. Harvest just a few leaves per plant so the remaining ones can supply (through photosynthesis) the energy the plant needs to form roots.\n" +
                "A celebration called \"The Night of the Radishes\" takes place every December 23rd in Oaxaca, Mexico. Giant radishes are carved into figures of saints and scenes of the Nativity.\n" +
                "Old-time Vermonters use the phrase \"had the radish\" to refer to something no longer functioning properly, as in, \"That old toaster has had the radish. It's time for a new one.\""))
        list.add( CardData(27, R.drawable.ic_tomato, colors[(0..8).random()],CategoryEnum.Vegetables.categoryName, "They are eaten raw or used in cooking. Canned tomatoes and tomato juice are also popular. Tomatoes are grown in all mild regions of the world. They belong to the nightshade family.\n" +
                "\n" +
                "Tomato plants generally have many spreading branches. The leaves are hairy and have a strong smell. The flowers are yellow and hang in clusters. The fruit is about 0.5 to 3 inches (1.3 to 7.6 centimeters) across. It can be round or oval or shaped like a pear. When ripe, the fruit is usually red or yellow. Tomatoes contain many small seeds surrounded by jellylike pulp. This pulp contains most of the tomato’s vitamin C.\n" +
                "\n" +
                "Tomato plants first grew wild in the Andes Mountains of South America. The Spanish brought tomatoes to Europe after finding them growing in the Americas. At first Europeans grew tomatoes only for decoration. They thought that tomatoes were poisonous because they are related to the deadly nightshade plants. Tomatoes did not become popular in the United States until the early 1900s."))
        list.add( CardData(28, R.drawable.ic_watermelon, colors[(0..8).random()],CategoryEnum.Vegetables.categoryName, "Part of the gourd family, the watermelon is a large, sweet fruit that grows on a vine. Watermelons are valued for their juicy flesh, which is served fresh in many parts of the world. The flesh can also be juiced to make drinks. The rind, or tough skin, is sometimes cut into pieces and pickled.\n" +
                "\n" +
                "Watermelons are native to tropical Africa. Today, however, they are cultivated (grown as a crop) on every continent except Antarctica. The plants grow best in areas with long, warm growing seasons. China and Turkey produce large quantities of the fruit. The chief watermelon-growing areas in the United States include Arizona, California, Florida, Georgia, and Texas.\n" +
                "\n" +
                "Watermelons grow on vines that spread along the ground. The leaves are large with deeply notched edges. The small flowers are yellow and grow in the crook between the leaf and the stem. Each flower on a watermelon vine produces either pollen or fruit.\n" +
                "\n" +
                "The fruits vary in size, shape, and color, depending on the type of watermelon. In general, watermelons weigh about 25 to 40 pounds (11 to 18 kilograms) or more. Smaller varieties weigh from about 3 to 10 pounds (1.4 to 4.5 kilograms). The flesh may be red, pink, or yellow. The rind may be thick or thin. It varies in color from light to dark green, with or without green stripes. Some watermelons have small, flat, dark seeds, while others are seedless. Seedless varieties have soft, white, undeveloped seeds in the flesh.\n" +
                "\n" +
                "Watermelons grow best in sandy soil. Seeds are typically planted 1 inch (2.5 centimeters) deep in hills about 8 feet (2.4 meters) apart. Seedlings are spaced 2 to 3 feet (61 to 91 centimeters) apart. The vine grows quickly. Two to fifteen fruits may grow on each vine. The fruits can be harvested within about 90 days. A watermelon is ripe when its underside, which sits on the soil, is creamy yellow instead of green or white. Watermelons do not ripen after they are picked, so for maximum flavor they should be picked when mature. Overripe watermelons have a mealy texture. Melons are cut from the vine by hand and can be stored for about two weeks."))

        list.add(CardData(29, R.drawable.ic_ananas, colors[(0..8).random()], CategoryEnum.Fruits.categoryName, "Pineapples are sweet, juicy fruits. They grow on a plant with the scientific name Ananas comosus. Ananas means “excellent fruit” in an Indian language from South America.\n" +
                "\n" +
                "Pineapples grow in tropical (warm) areas around the world. The leading producers of pineapples include Thailand, the Philippines, India, China, Brazil, and the U.S. state of Hawaii.\n" +
                "\n" +
                "Pineapples grow on plants that have leaves shaped like long swords. The plants also have purple flowers and smaller leaves. As they grow, these flowers and leaves join together to form the pineapple fruit.\n" +
                "\n" +
                "A ripe pineapple looks like a cactus. The outer peel is very tough. It has sections that look like eyes. Each “eye” is formed from one flower. A group of leaves grows out of the fruit’s top. These leaves are called the crown. The inside of the fruit is fleshy and yellow.\n" +
                "\n" +
                "Some pineapple plants do not produce seeds. In such cases, new plants are grown from cuttings, or pieces of the plants. Farmers prepare for planting by laying a covering of heavy paper or plastic over the soil. Then they plant the cuttings through holes in the covering. The covering protects the young plants.\n" +
                "\n" +
                "Pineapples can be eaten fresh or canned. In some areas people use them in baked desserts. Pineapple leaves contain a silky fiber. In the Philippines people weave the fiber into a delicate fabric called piña cloth."))
        list.add(CardData(30, R.drawable.ic_apple, colors[(0..8).random()], CategoryEnum.Fruits.categoryName, "Apples are one of the world’s most widely grown fruits. People have eaten them since ancient times. There are thousands of varieties of apples. They grow on trees that belong to the same scientific family as roses.\n" +
                "\n" +
                "People grow apples in North America, Europe, and Asia. The leading producers of apples include China, the United States, Poland, Iran, Turkey, and France. Apple trees grow best in areas where the summers are mild and the winters are somewhat cold.\n" +
                "\n" +
                "Apple trees are small to medium in size. In the spring they grow white flowers. The fleshy fruits are usually ready to be picked in autumn. Apples are red, yellow, or greenish and fairly round. They are about 2 to 4 inches (5 to 10 centimeters) wide.\n" +
                "\n" +
                "A new apple tree can grow from an apple seed. However, it will not grow the same variety of apple as the tree that made the seed. Because of this, people normally grow apple trees using another method. They cut a twig or bud from the apple tree to be reproduced. They attach this twig or bud to a rootstock, or a young apple tree grown for its strong roots. The parts from the two trees soon grow together into one tree. This new tree will produce the same variety of apple as the one from which the twig or bud came.\n" +
                "\n" +
                "Apples contain fruit sugars, fiber, and the vitamins A and C. Some varieties are good for eating raw. Other types are best cooked. In the United States apple pie is a traditional dessert. In Europe people often serve fried apples with sausage or pork. Farmers grow some varieties of apples for their juice. People drink the juice fresh or make it into a drink called cider."))
        list.add(CardData(31, R.drawable.ic_banana, colors[(0..8).random()], CategoryEnum.Fruits.categoryName, "Bananas are the fruit produced by various banana plants.\n" +
                "\n" +
                "When rip they are usually long and curved with a soft inside covered by a yellow skin (peel).\n" +
                "\n" +
                "Bananas can be found in other colors, including red.\n" +
                "\n" +
                "Banana plants are not trees, they are a type of herb.\n" +
                "\n" +
                "Humans have grown bananas for thousands of years.\n" +
                "\n" +
                "Most species of banana plant originated in Southeast Asia.\n" +
                "\n" +
                "Bananas grow in large, hanging bunches.\n" +
                "\n" +
                "A row of bananas is sometimes called a 'hand', while a single banana is called a 'finger'.\n" +
                "\n" +
                "The average banana weighs around 125 grams.\n" +
                "\n" +
                "Bananas contain around 75% water.\n" +
                "\n" +
                "Bananas have high nutritional value and are a healthy snack.\n" +
                "\n" +
                "The Gros Michel banana was a popular variety before crops were destroyed by Panama disease in the 1950's. Panama disease attacks the roots of banana plants.\n" +
                "\n"))
        list.add(CardData(32, R.drawable.ic_cherry, colors[(0..8).random()], CategoryEnum.Fruits.categoryName, "Cherries are small, round fruits that can be sweet or sour. They grow on trees that are also known for their flowers. Cherry trees grow throughout the world, in areas that do not get extreme heat or cold.\n" +
                "\n" +
                "Different types of cherry tree produce sweet cherries and sour cherries. Sweet-cherry trees are large, reaching heights up to 36 feet (11 meters). Their fruit is usually round or heart-shaped. Sweet cherries vary in color from yellow to red to nearly black. People eat sweet cherries fresh or canned.\n" +
                "\n" +
                "Sour-cherry trees are smaller than sweet-cherry trees. They are usually less than 16 feet (5 meters) tall. Sour cherries are round and smaller than sweet cherries. They are usually dark red. Sour cherries are not eaten fresh because of their sour taste. They are frozen or canned and used in sauces and pastries, such as cherry pie.\n" +
                "\n" +
                "Some kinds of cherry tree do not bear fruit. But people like these trees for the beautiful pink and white flowers they bear. Many cherry trees are planted in gardens and parks, especially in Japan.\n" +
                "\n" +
                "The wood of cherry trees is valued for its rich red color. People use cherry wood to make cabinets, furniture, and other products."))
        list.add(CardData(33, R.drawable.ic_grape, colors[(0..8).random()], CategoryEnum.Fruits.categoryName, "Grapes are bulb-shaped fruits. They can be eaten fresh, dried to make raisins, or crushed to make grape juice or wine. There are more than 8,000 varieties of grape.\n" +
                "\n" +
                "Grapes grow in wooded and warm regions of the world. Large quantities grow in France, Spain, Italy, Turkey, and Georgia. About a thousand varieties of grapes have been developed in the United States.\n" +
                "\n" +
                "The grape plant is a woody vine. When left untrimmed, the vine often grows 56 feet (17 meters) or more. (Trimming, however, is important for proper growth of the vine.) Leaves are large and rounded with tooth-shaped edges. Flowers are small and green and appear in clusters. These eventually become the grape fruits.\n" +
                "\n" +
                "Grapes vary in color. They range from pale green or yellow to red, purple, or black. Inside, most grapes have seeds and juicy pulp. Grapes are a good source of minerals and vitamin A.\n" +
                "\n" +
                "Grapes have a long history. Grape seeds have been found along with mummies in Egyptian tombs that are at least 3,000 years old. The ancient Greeks and Romans grew grapes to make wine. From there grapes spread throughout the world."))
        list.add(CardData(34, R.drawable.ic_kiwi, colors[(0..8).random()], CategoryEnum.Fruits.categoryName, "Kiwifruits are originally from China and they used to be called the ‘Chinese Gooseberry’ before they were renamed ‘Kiwi fruit’ in 1959 by the New Zealanders, due to its similar appearance to a kiwi bird.\n" +
                "Kiwifruit has brown fuzzy skin and bright green flesh with circles of edible dark seeds in the middle.\n" +
                "Kiwis are also eaten by many animals such as monkeys and deer.\n" +
                "Kiwis are normally eaten raw in fruit salad or blended into juices.\n" +
                "Eating 2 kiwi fruits an hour before bedtime will help you get a better night sleep.\n" +
                "As previously stated, the kiwifruit was first grown in China and it was only as recently as 1904 that the fruit was first grown in New Zealand, the country where the fruit gets its name.\n" +
                "\n" +
                "Today, kiwifruits are grown not only in New Zealand but all across the world. It is also grown in Italy, France, Greece, Chile, China, Japan, South Korea and California, America. The growing season for kiwifruits is very long, lasting around 240 days."))
        list.add(CardData(35, R.drawable.ic_lemon, colors[(0..8).random()], CategoryEnum.Fruits.categoryName, "Lemons are tart, yellow fruits that grow on a small tree or spreading bush. Like limes, oranges, and grapefruit, lemons are citrus fruits. The lemon plant’s scientific name is Citrus limon.\n" +
                "\n" +
                "Lemons grow in many warm regions of the world. Major lemon-growing countries include India, Argentina, Spain, Iran, and the United States. In the United States most lemons grow in California and Arizona.\n" +
                "\n" +
                "Lemon trees grow to about 10 to 20 feet (3 to 6 meters) high. They produce sweet-smelling flowers that are white on top and reddish purple on the bottom. The fruits, or lemons, grow from these flowers.\n" +
                "\n" +
                "Lemons are shaped like an oval with a bump on one end. Their rind, or skin, is thick. It starts out green and turns yellow when the fruit is ripe. Inside each fruit is juicy flesh called pulp.\n" +
                "\n" +
                "The juice of lemons is tart because it contains a substance called citric acid. Lemon juice is rich in vitamin C as well. People use lemon juice to flavor pastries, pies, vegetables, fish, and many other foods. They mix it with water and sugar to make lemonade, a popular warm-weather drink. People also use lemons to make fruit jellies, soaps, perfumes, and medicines."))
        list.add(CardData(36, R.drawable.ic_mango, colors[(0..8).random()], CategoryEnum.Fruits.categoryName, "A mango is the fruit of a tree that grows in warm parts of the world. The mango tree is a member of the sumac, or cashew, family. Its scientific name is Mangifera indica.\n" +
                "\n" +
                "The mango tree first grew in India and parts of eastern Asia. Today people grow the tree in the Americas and Africa as well.\n" +
                "\n" +
                "The mango tree may grow to 60 feet (18 meters) tall. The fruits develop from small, pinkish flowers. The smallest mangoes are the size of a plum. The largest mangoes weigh as much as 5 pounds (2.3 kilograms). Mangoes may be round, oval, kidney-shaped, or heart-shaped. Their smooth, thin skin may be green, red, yellow, purple, or a combination of these colors. Their juicy flesh is yellow-orange. They have one large pit, or seed, inside.\n" +
                "\n" +
                "Mangoes are a major source of food in India, the West Indies, and other places. People eat mangoes fresh and in main dishes and desserts. People also use mangoes to make sauces called chutneys. Mangoes are rich in vitamins A, C, and D.\n" +
                "\n"))
        list.add(CardData(37, R.drawable.ic_orange, colors[(0..8).random()], CategoryEnum.Fruits.categoryName, "Oranges are citrus fruits with fragrant, leathery skin and juicy flesh. The most common types are the sweet (or common) orange, the sour (or Seville) orange, and the mandarin orange. The sweet orange is the most widely grown citrus fruit in the world.\n" +
                "\n" +
                "Orange trees originally grew in the tropical regions of southeastern Asia. Today people grow them in most warm areas of the world.\n" +
                "\n" +
                "Most sweet orange trees are about 20 feet (6 meters) tall. They have glossy, green leaves and small white flowers.\n" +
                "\n" +
                "The size, shape, and color of orange fruits vary somewhat depending on the type. The fruits are generally round and about 2 to 4 inches (5 to 10 centimeters) across. The peel is commonly orange or greenish yellow. It is dotted with oily glands that give the fruit a strong fragrance. The pulp inside the fruit often holds many seeds. However, the navel orange is a form of sweet orange without seeds.\n" +
                "\n" +
                "Oranges are rich in vitamin C. People peel and eat oranges raw. They also use them in sauces, marmalades, and other foods. Orange juice is sold fresh or frozen. People use orange oil as a flavoring or as a fragrance."))
        list.add(CardData(38, R.drawable.ic_peach, colors[(0..8).random()], CategoryEnum.Fruits.categoryName, "Peaches are fruits that have fuzzy skins. There are thousands of varieties of peaches. They are among the most widely eaten fruits in the world.\n" +
                "\n" +
                "Peach trees grow where the weather is mild. The United States is a major producer of peaches. They grow in such states as California, Washington, South Carolina, and Georgia.\n" +
                "\n" +
                "Peach trees can be 21 feet (6.5 meters) tall. Most farmers only let the trees grow to about 10 to 13 feet (3 to 4 meters). This makes it easier to pick the fruit. Flowers appear in spring. They may be white, pink, red, or purplish. The peach fruits grow from these flowers.\n" +
                "\n" +
                "Farmers plant peach trees in orchards. When the fruit begins to develop, farmers cut down some of the tree branches. This helps the fruit left on the tree grow larger.\n" +
                "\n" +
                "Peach fruits, or peaches, are round. They are about 3 inches (7.6 centimeters) across. Peaches may be yellow, orange, red, or white. Their skin is usually fuzzy, but some peaches are smooth. These are called nectarines. In the center of a peach is a large stone called a pit.\n" +
                "\n" +
                "People eat peaches fresh. They are also used to make jams, pies, cobblers, and other desserts. Peaches are sometimes canned.\n"))
        list.add(CardData(39, R.drawable.ic_pear, colors[(0..8).random()], CategoryEnum.Fruits.categoryName, "Pears are a popular fruit that can be dried, cooked, or eaten fresh. People use pears in salads, desserts, and jams. They also drink pear juice. Pears are a good source of potassium and fiber.\n" +
                "\n" +
                "Pears grow in mild regions throughout the world. China, Italy, and the United States are the countries that grow the most pears. Among U.S. states, Washington, Oregon, and California usually grow the largest amount of pears.\n" +
                "\n" +
                "Pear trees can grow as tall as 50 feet (15 meters) and can live for 75 years or more. They have broad, spreading branches and rounded or oval leaves. The leaves appear on the tree about the same time that the flowers do. Pear flowers are about 1 inch (2.5 centimeters) wide with five rounded, white petals. Part of the flower later develops into the fruit.\n" +
                "\n" +
                "The fruit may be yellow, green, red, or brownish in color. Some pears are narrow at the stem and rounder on the bottom. Others are round like an apple. Pears are generally sweeter and softer than apples, though some can be slightly tart. Well-known types grown in the United States include Bartlett, Bosc, and Anjou pears."))
        list.add(CardData(40, R.drawable.ic_pomegranate, colors[(0..8).random()], CategoryEnum.Fruits.categoryName, "Because of the remarkable abundance of its seeds, the pomegranate has long been a symbol of fertility. According to Greek legend Persephone, daughter of the goddess of agriculture, was forced to spend four months of every year in the underworld because she had eaten one seed of the pomegranate. The plant has been considered a symbol of beauty, and its large scarlet flowers, red-gold spherical fruit, and glossy green leaves have inspired countless allusions in literature and art. According to the Bible, King Solomon possessed an orchard of pomegranates, and when the children of Israel wandered in the wilderness, they remembered longingly the cooling pomegranates of Egypt.\n" +
                "\n" +
                "The fruit is about the size of a large orange, with smooth, leathery skin. Inside it is divided into chambers containing a reddish, juicy pulp, ranging in taste from acid to very sweet, that surrounds the numerous seeds. In order to eat the pulp, it must either be painstakingly separated from the individual seeds or swallowed with them. As a result, one early writer said, “Pomegranates can be eaten, but . . . there are easier things to eat and enjoy.” Although the pomegranate is eaten as a fresh fruit, more often the pulp is put through a sieve and the juice used to make grenadine syrup and in beverages, flavorings, and liqueurs. In Iran and Jamaica, pomegranates are used in soups, sauces, and jellies. The pomegranate grows wild in Iran and neighboring countries. It is cultivated throughout the tropics and subtropics and from the warmer parts of the United States to Chile. The tree is often grown as an ornamental. The scientific name of the pomegranate is Punica granatum."))
        list.add(CardData(41, R.drawable.ic_strawberry, colors[(0..8).random()], CategoryEnum.Fruits.categoryName, "Strawberries are red, heart-shaped fruits. They are eaten fresh, often with cream. They are also used as a filling for pastries, pies, and cakes. Strawberries are rich in vitamin C, and they also contain iron and other minerals.\n" +
                "\n" +
                "Strawberry plants grow in mild regions all over the world. The United States and Canada are leading producers of strawberries. Many countries have developed their own strawberry varieties to suit their climate.\n" +
                "\n" +
                "Strawberry plants grow close to the ground. At the top of the plant is the crown, from which the leaves sprout. The leaves have three hairy parts with jagged edges. White flowers grow in small groups on slender stalks. As the plant gets older, the crown sends out runners that spread over the ground and form new roots. This makes the plant bigger.\n" +
                "\n" +
                "Botanists (people who study plants) do not consider strawberries to be true berries. A true berry, such as a blueberry, is a single fruit that forms from a single flower. Strawberries are actually groups of small fruits that form from a single flower.\n" +
                "\n" +
                "Strawberries need to be stored in a cool and dry place after they have been picked. But they still do not stay fresh for very long. Some are frozen or canned to make them last longer."))
    }


    fun getCards(difficultyEnum: DifficultyEnum, categoryEnum: CategoryEnum): List<CardData> {
        val result = ArrayList<CardData>()
        val count = difficultyEnum.horizontalItems * difficultyEnum.verticalItems / 2

        list.shuffle()


        result.addAll(
            list.filter {
                it.category == categoryEnum.categoryName
            }.subList(0, count)
        )

        result.addAll(
            list.filter {
                it.category == categoryEnum.categoryName
            }.subList(0, count)
        )




        result.shuffle()

        return result
    }



}