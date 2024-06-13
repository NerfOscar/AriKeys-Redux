![https://i.imgur.com/OMtfz7Z.png](https://i.imgur.com/nv7kk3v.png)

AriKeys Redux is a fork of the original [AriKeys](https://github.com/ASangarin/AriKeys) by ASangarin.

AriKeys is a client-side mod for Minecraft, which allows your client to receive and send keypresses packets between servers using the AriKeys plugin. This mod only works when connected to a server that utilizes the AriKeysPlugin for proper functionality.

Versions and loaders supported by AriKeys Redux:
- 1.20.4 [Fabric]

[*For 1.20.1 [Fabric-Forge] and less...*](https://github.com/ASangarin/AriKeys)

# Fabric installation:
- Download and install [Fabric](https://fabricmc.net/use/installer/).
- Download [Fabric API](https://modrinth.com/mod/fabric-api) and put it in your mods folder.
- Download [AriKeys Redux Fabric](https://github.com/NerfOscar/AriKeys-Redux/releases) and place it in your mods folder.

# PaperMC installation:
- Stop you [PaperMC](https://papermc.io/) server.
- Download [AriKeys Redux Paper](https://github.com/NerfOscar/AriKeys-Redux/releases) and place it in your plugins folder.
- Start you server.

# Usage for server Owners/Developers:
Once installed, the plugin is ready to go. You can define new keybinds and actions inside the config.yml found in your `plugins/AriKeysRedux`.

<details>
  <summary>Show default config.yml</summary>
  
```
  # AriKeysReduxPlugin
  # Made by Aria Sangarin, Ported by NerfOscar
  
  # Config Version 5
  
  # Whether the event should be fired or not
  # if a command was configured for the key ID.
  run_event_on_command: true
  
  # Input your desired keys here and the client mod
  # will automatically grab these from the server and
  # allow the player to use, see and customize them.
  # NOTE: The player has to rejoin the server to see the changes.
  Keys:
    example_key: # Purely for organization. Can be named anything.
      Id: "myserver:mycoolkey" # The namespace and path of the pressed key which is passed to the event
      Name: "Example Key" # The name of this keybinding as displayed in the settings
      Category: "Example Category" # The category this key falls under in the settings
      DefaultKey: 74 # The default keybinding to use. See https://www.glfw.org/docs/latest/group__keys.html (74 is J)
      RunCommand: "say %player%, you just pressed the example key!" # The command to run. You can use '%player%' as a placeholder.
      # There is also support for all PAPI placeholders.
      # If you don't want the key to run a command (for external plugin support), just leave it empty.
  
      #SkillPress: "RunWhenKeyPressed"
      #SkillRelease: "RunWhenKeyReleased"
      # If you have MythicMobs installed, you can specify an MM skill to be ran when a key is pressed or released.
    another_key:
      Id: "examplekeytwo" # A key without a namespace will simply use the default namespace.
      #This example ID will become: "arikeys:examplekeytwo"
      Name: "Another Key"
      Category: "Example Category"
      DefaultKey: 77 # 77 is the M key
      Modifiers: [LEFT_SHIFT, LEFT_CTRL] # The keybindings that must also be held for this to work.
      # See the wiki (https://github.com/NerfOscar/AriKeys-Redux/wiki) for the rest of modifiers.
      RunCommand: "!msg %player% You pressed another example key. Nice."
      # Putting a ! as the first letter of the command will make it run from console.
    minecraft_key: # This doesn't have to be named "minecraft_key", you can implement any name that you want.
      Id: "minecraft:swapoffhand" # You have to register any Minecraft keybinds you want to use here.
      # If you don't register a Minecraft keybind the AriKeys won't be able to listen to it.
      # You don't have to include Name, Category, Modifier or DefaultKey as those fields won't be used.
      # You can still implement a RunCommand and or Mythic Mobs skill. (SkillPress / SkillRelease)
      # See the wiki (https://github.com/NerfOscar/AriKeys-Redux/wiki) for all Minecraft keybinds.
  
  # End of config.
```

</details>

More info in the [wiki.](https://github.com/NerfOscar/AriKeys-Redux/wiki)

# Usage for players:
When joining a server with AriKeys installed, your client will receive a list of keybinds, which you can change inside the game menu.

*(Note that the button will only appears when you are inside a server with AriKeys installed)*
![AriKeys Button](https://i.imgur.com/LAFh91m.png)
