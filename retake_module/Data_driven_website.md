
### Data as a service

In this reflection, I will delve into my experience of implementing data-driven websites and explore the intricate web of technologies that operate within each layer of the architecture. Moreover, I will discuss the performance trade-offs that often accompany such dynamic developments.
(Team nutrition app)[LO2.6.2.5]
My first hands-on experience with a data-driven project was Team Tay, a student venture that aimed to develop a nutrition app. Although the project wasn't fully completed, I successfully developed a core functionality. The app's objective was to calculate nutritional values and present recommended meals. My contribution focused on calculating calories from various fruits and vegetables. For this, our team used React Native and integrated an external API from edamam.com. Through a free account, I accessed basic nutritional information about fruits and vegetables, enabling the app to offer users valuable dietary insights.
(Todorow nutrition UI A)
(Todorow nutrition UI B)
(Todorow Jjira board tay)[LO2.6.2.5]
In the process of developing the nutrition app, one of the significant trade-offs I encountered was centered around user interface design versus functional content. The crucial question was whether to prioritize a visually appealing interface with limited content or to provide a straightforward result display without an elaborate UI. My choice was to demonstrate the app's capability to connect to an external API and deliver the desired results—in this case, calorie information. This decision helped showcase the app's functionality to the product owner, while highlighting the need for UI refinement. Ultimately, this approach proved effective as it provided a tangible working prototype that could later be polished aesthetically.
(Todorow campbells repo)[LO2.6.2.5]
During my internship, I undertook a more complex data-driven initiative. The project involved merging data from three separate warehouse databases, each containing a staggering 6000 items. The primary goal was to streamline results to provide insights into daily sales. Although the stock management application lacked the feature to unify databases, I devised a solution. Despite continuous requests to the system provider for an API, this option wasn't forthcoming.
(Todorow campbells app main)
(Todorow campbells app sales)
My workaround involved manual downloading of XML files from the stock database. Technologie involved in tier of the architecture: I leveraged Next.js for my application due to its integrated server capabilities. This allowed me to upload the XML files directly into the app, perform calculations, and subsequently enable users to download results in Microsoft Excel format. This approach provided a bridge between the warehouses' disparate datasets, yielding actionable insights despite the system's limitations.
[LO2.6.2.5]
Trade-off emerged when I aimed to convince the product owner of the app's potential to enhance employee efficiency and accessibility. To achieve this, I concentrated on creating a user-friendly UI alongside functional code. Time constraints were significant, compelling me to prioritize speed over writing immaculate code. In this context, I adopted a phased approach, dividing the project into three sprints.

The first sprint aimed at demonstrating the core feature—combining databases. While the UI might have been rudimentary and the process of adding XML files to the app slightly cumbersome, the fact that the database sorting results were clear and accessible garnered the product owner's confidence. This milestone paved the way for the next two sprints.
[LO2.6.2.5]
With an increasingly demanding schedule, I was confronted with the constant trade-off of delivering more features versus writing perfect code. This required a delicate balance between what could feasibly be achieved and what was expected by the stakeholders. Amid these considerations, I had limited opportunities for code refactoring.

Finally, after three weeks of intensive development, I managed to allocate time for comprehensive code refactoring and the creation of a more user-friendly UI. This brought the project to a level of refinement that aligned with both functionality and aesthetics. Balancing these aspects, amidst evolving project requirements, taught me the art of making informed decisions that drive a project forward while ensuring it meets the necessary standards of quality and usability.
[LO2.6.2.5]
In retrospect, my journey through these data-driven projects has unveiled the intricate tightrope walk between various considerations in web development. The nutrition app project highlighted the trade-off between aesthetics and functionality. While prioritizing functionality to showcase the app's potential was crucial, it also underscored the importance of refining the user experience to deliver a comprehensive product.

Similarly, the internship project taught me the value of effective communication with stakeholders. The constant negotiation between developing more features and maintaining code quality highlighted the necessity of strategic decision-making within real-world constraints. Navigating these trade-offs was a crucial lesson, reinforcing that prioritization and adaptability are paramount to successful project execution.

As I move forward in my journey, I plan to integrate the lessons learned from these experiences into my approach to web development. I recognize the need to strike a balance between functionality and aesthetics, acknowledging that both are vital components of a successful product. Enhancing my skills in user interface design will be a focal point, as an appealing UI can significantly enhance user engagement and satisfaction.

Additionally, I intend to further cultivate my proficiency in communicating the value and potential impact of a project to stakeholders. This will involve refining my ability to outline the trade-offs and benefits associated with various technical decisions. Navigating the delicate line between delivering more features and maintaining code quality will remain a cornerstone of my future projects.

In essence, these projects have fortified my understanding that web development is a dynamic interplay of technical prowess, strategic thinking, and effective communication. As I advance, I am committed to applying these lessons to create data-driven websites that not only function effectively but also provide a seamless and delightful user experience.

Team, Tay. “Nutrition App.” GitHub, 2023, github.com/vileider/nutrition_app. 

Todorow, Bogdan. “Nutrition UI A.” Bitbucket Repo, 2023, bitbucket.org/vileider/year2_fixed/src/master/images/nutrition_app_ui1.png. 

Todorow, Bogdan. “Nutrition UI B.” Bitbucket Repo, 2023, bitbucket.org/vileider/year2_fixed/src/master/images/nutrition_app_ui2.png. 

Todorow, Bogdan. “Jjira Board Tay.” Bitbucket Repo, 2023, bitbucket.org/vileider/year2_fixed/src/master/images/jira_board_tay.png. 

Todorow, Bogdan. “Campbells Repo.” Bitbucket Repo, 2023, bitbucket.org/vileider/year2_fixed/src/master/images/campbells_repo.png. 

Todorow, Bogdan. “Campbells App Main.” Bitbucket Repo, 2023, bitbucket.org/vileider/year2_fixed/src/master/images/campbells_app_main.png. 

Todorow, Bogdan. “Campbells App Sales.” Bitbucket Repo, 2023, bitbucket.org/vileider/year2_fixed/src/master/images/campbells_app_sales.png. 